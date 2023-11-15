import React, { FormEventHandler, useState } from "react";
import { UserForm } from "../../types/UserForm";
import { postUser } from "../api/usersAPI";
import { IoIosInformationCircleOutline } from "react-icons/io";
import { validEmail, validPassword } from "../../types/Regex";

type SignUpError = {
  email: boolean;
  password: boolean;
};

const SignUpForm = () => {
  const [formFields, setFormFields] = useState<UserForm>({
    email: "",
    password: "",
  });
  const [repeat, setRepeat] = useState<string>("");
  const [errors, setErrors] = useState<SignUpError>({
    email: false,
    password: false,
  });

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>): void => {
    setFormFields({ ...formFields, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    if (!errors.email && !errors.password) {
      postUser(formFields);
    }
  };

  const passwordError = (): JSX.Element => {
    if (
      formFields.password !== repeat ||
      !validPassword.test(formFields.password)
    ) {
      // setErrors({ ...errors, password: true });
      return (
        <>
          <p className="flex flex-row gap-2">
            Please enter correct password
            <span className="">
              <IoIosInformationCircleOutline />
            </span>
          </p>
        </>
      );
    } else {
      setErrors({ ...errors, password: false });
      return <></>;
    }
  };

  const emailError = (): JSX.Element => {
    if (!validEmail.test(formFields.email)) {
      // setErrors({ ...errors, email: true });
      return (
        <>
          <p className="flex flex-row gap-2">
            Please enter correct login
            <span>
              <IoIosInformationCircleOutline />
            </span>
          </p>
        </>
      );
    } else {
      setErrors({ ...errors, email: false });
      return <></>;
    }
  };

  const showErrors = (): JSX.Element => {
    if (errors.email || errors.password) {
      return (
        <>
          <div className="bg-red-300 text-red-600 gap-2 flex flex-col p-4 justify-center items-center">
            {emailError()}
            {passwordError()}
          </div>
        </>
      );
    } else {
      return <></>;
    }
  };

  return (
    <div className="w-[90vw] md:w-[80vw] h-[80vh] mx-auto left-0 right-0 my-4">
      <h1 className="text-5xl font-bold flex justify-center py-4">Sign up</h1>
      <div className="w-[600px] h-[600px] mx-auto left-0 right-0  border-[1px] border-solid border-black/50">
        {showErrors()}
        <form
          className="flex flex-col w-[400px] gap-3 justify-center items-center mx-auto left-0 right-0 p-4"
          onSubmit={(e) => handleSubmit(e)}
          method="POST"
        >
          <label className="text-lg ">Email</label>
          <input
            type="text"
            name="email"
            className="border-[1px] border-solid border-black/50"
            value={formFields.email}
            onChange={(e) => handleChange(e)}
          />
          <label className="text-lg ">Password</label>
          <input
            type="password"
            name="password"
            className="border-[1px] border-solid border-black/50"
            value={formFields.password}
            onChange={(e) => handleChange(e)}
          />
          <label className="text-lg ">Repeat password</label>
          <input
            type="password"
            className="border-[1px] border-solid border-black/50"
            value={repeat}
            onChange={(e) => setRepeat(e.target.value)}
          />
          <input
            type="submit"
            value="Submit"
            className="border-black/50 border-[1px] border-solid p-2 px-4 rounded-lg  cursor-pointer hover:bg-yellow-400 "
          />
        </form>
      </div>
    </div>
  );
};

export default SignUpForm;
