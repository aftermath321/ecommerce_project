import React, { FormEventHandler, useState } from "react";
import { UserForm } from "../../types/UserForm";
import { postUser } from "../api/usersAPI";

const tmpUser: UserForm = {
  login: "",
  email: "",
  password: "",
  repeat: "",
};

const SignUpForm = () => {
  const [login, setLogin] = useState<string>("");
  const [email, setEmail] = useState<string>("");
  const [password, setPassword] = useState<string>("");
  const [repeat, setRepeat] = useState<string>("");
  const [userState, setUserState] = useState<UserForm>(tmpUser);

  const sendForm = (event: React.FormEvent<HTMLFormElement>) => {
    event?.preventDefault();

    let tempUser = {
      login: login,
      email: email,
      password: password,
      repeat: repeat,
    };

    setUserState(tempUser);
    postUser(userState);
  };

  return (
    <div className="w-[90vw] md:w-[80vw] h-[80vh] mx-auto left-0 right-0 my-4">
      <h1 className="text-5xl font-bold flex justify-center py-4">Sign up</h1>
      <div className="w-[600px] h-[600px] mx-auto left-0 right-0  border-[1px] border-solid border-black/50">
        <form
          className="flex flex-col w-[400px] gap-3 justify-center items-center mx-auto left-0 right-0 p-4"
          onSubmit={sendForm}
        >
          <label className="text-lg ">Login</label>
          <input
            type="text"
            className="border-[1px] border-solid border-black/50"
            value={login}
            onChange={(e) => setLogin(e.target.value)}
          />
          <label className="text-lg ">Email</label>
          <input
            type="text"
            className="border-[1px] border-solid border-black/50"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
          <label className="text-lg ">Password</label>
          <input
            type="password"
            className="border-[1px] border-solid border-black/50"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
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
