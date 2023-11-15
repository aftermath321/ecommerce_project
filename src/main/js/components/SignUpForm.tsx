import React, { FormEventHandler, useState } from "react";
import { UserForm } from "../../types/UserForm";
import { postUser } from "../api/usersAPI";
import { send } from "process";

const tmpUser: UserForm = {
  login: "",
  email: "",
  password: "",
};

const SignUpForm = () => {
  const [formFields, setFormFields] = useState({
    login: "",
    email: "",
    password: "",
  });
  const [repeat, setRepeat] = useState<string>("");
  const [errors, setErrors] = useState<object>({});
  const [submit, setSubmit] = useState<boolean>(false);

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setFormFields({ ...formFields, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e: React.FormEvent<SubmitEvent>) => {
    e.preventDefault();
    setErrors(validateForm(formFields));
    setSubmit(true);
  };

  const validateForm = (formFields) => {
    let errors = {};
    if (formFields.email < 15){
      errors.email = "Email is too short."
    }
    if
  }

  return (
    <div className="w-[90vw] md:w-[80vw] h-[80vh] mx-auto left-0 right-0 my-4">
      <h1 className="text-5xl font-bold flex justify-center py-4">Sign up</h1>
      <div className="w-[600px] h-[600px] mx-auto left-0 right-0  border-[1px] border-solid border-black/50">
        <form
          className="flex flex-col w-[400px] gap-3 justify-center items-center mx-auto left-0 right-0 p-4"
          // onSubmit={checkForm}
        >
          <label className="text-lg ">Login</label>
          <input
            type="text"
            className="border-[1px] border-solid border-black/50"
            name="login"
            value={formFields.login}
            onChange={(e) => handleChange(e)}
          />
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
          <button
            type="submit"
            value="Submit"
            formMethod="POST"
            className="border-black/50 border-[1px] border-solid p-2 px-4 rounded-lg"
          >
            Sign up
          </button>
        </form>
      </div>
    </div>
  );
};

export default SignUpForm;
