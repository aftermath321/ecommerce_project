import { Dialog, Transition } from "@headlessui/react";
import { FormEvent, Fragment, SetStateAction, useState } from "react";
import { login } from "../../api/usersAPI";
import { UserForm } from "../../../types/UserForm";

const LoginAndSignUp = (props: { state: boolean; toggle: Function }) => {
  const [loginForm, setLoginForm] = useState<UserForm>({
    email: "",
    password: "",
  });
  const [loginMessage, setLoginMessage] = useState<String>("");

  const submitLogin = (event: FormEvent<HTMLFormElement>): void => {
    event.preventDefault();

    login(loginForm).then((response) => {
      console.log(response);
    });
    
  };

  const handleEmail = (event: React.ChangeEvent<HTMLInputElement>): void => {
    setLoginForm({
      ...loginForm,
      email: event.target.value,
    });
  };
  const handlePassword = (event: React.ChangeEvent<HTMLInputElement>): void => {
    setLoginForm({
      ...loginForm,
      password: event.target.value,
    });
  };

  return (
    <>
      <Transition appear show={props.state} as={Fragment}>
        <Dialog
          as="div"
          className="relative z-10"
          onClose={props.toggle(false)}
        >
          <Transition.Child
            as={Fragment}
            enter="ease-out duration-300"
            enterFrom="opacity-0"
            enterTo="opacity-100"
            leave="ease-in duration-200"
            leaveFrom="opacity-100"
            leaveTo="opacity-0"
          >
            <div className="fixed inset-0 bg-black/25" />
          </Transition.Child>

          <div className="fixed inset-0 overflow-y-auto">
            <div className="flex min-h-full items-center justify-center p-4 text-center">
              <Transition.Child
                as={Fragment}
                enter="ease-out duration-300"
                enterFrom="opacity-0 scale-95"
                enterTo="opacity-100 scale-100"
                leave="ease-in duration-200"
                leaveFrom="opacity-100 scale-100"
                leaveTo="opacity-0 scale-95"
              >
                <Dialog.Panel className="w-full max-w-md transform overflow-hidden rounded-2xl bg-white p-6 text-center align-middle shadow-xl transition-all">
                  <Dialog.Title
                    as="h3"
                    className="text-2xl font-bold  leading-6 text-gray-900 py-4"
                  >
                    Log in
                  </Dialog.Title>
                  <Dialog.Title className="text-xl text-red-600">
                    {loginMessage}
                  </Dialog.Title>
                  <div className="w-[100%] p-2">
                    <form onSubmit={submitLogin}>
                      <div className="mt-2 flex flex-col flex-nowrap gap-2">
                        <label>Email</label>
                        <input
                          type="text"
                          className="bg-slate-200 rounded-md border-[1px] border-black/10 shadow-bigShadow w-[50%] self-center"
                          value={loginForm.email}
                          onChange={(event) => handleEmail(event)}
                        ></input>
                        <label>Password</label>
                        <input
                          type="password"
                          value={loginForm.password}
                          className="bg-slate-200 rounded-md border-[1px] border-black/10 shadow-bigShadow w-[50%] self-center"
                          onChange={(event) => handlePassword(event)}
                        ></input>
                      </div>

                      <div className="mt-4">
                        <button
                          className="inline-flex justify-center rounded-md border border-transparent bg-yellow-200 px-4 py-2 text-sm font-medium text-yellow-600 hover:bg-yellow-300 focus:outline-none focus-visible:ring-2 focus-visible:text-yellow-400 focus-visible:ring-offset-2"
                          type="submit"
                        >
                          Log in
                        </button>
                      </div>
                    </form>
                  </div>
                </Dialog.Panel>
              </Transition.Child>
            </div>
          </div>
        </Dialog>
      </Transition>
    </>
  );
};

export default LoginAndSignUp;
