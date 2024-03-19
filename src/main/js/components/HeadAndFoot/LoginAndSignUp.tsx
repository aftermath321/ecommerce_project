import { Dialog, Transition } from "@headlessui/react";
import { Fragment } from "react";

const LoginAndSignUp = (props: { state: boolean; toggle: Function }) => {
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
                <Dialog.Panel className="w-full max-w-md transform overflow-hidden rounded-2xl bg-white p-6 text-left align-middle shadow-xl transition-all">
                  <Dialog.Title
                    as="h3"
                    className="text-lg font-medium leading-6 text-gray-900"
                  >
                    Sign in
                  </Dialog.Title>
                  <div className="mt-2">
                    <label>Login</label>
                    <input type="text"></input>
                    <label>Password</label>
                    <input type="password"></input>
                  </div>

                  <div className="mt-4">
                    <button
                      type="button"
                      className="inline-flex justify-center rounded-md border border-transparent bg-yellow-200 px-4 py-2 text-sm font-medium text-yellow-600 hover:bg-yellow-300 focus:outline-none focus-visible:ring-2 focus-visible:text-yellow-400 focus-visible:ring-offset-2"
                      onClick={() => props.toggle(false)}
                    >
                      Sign up
                    </button>
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
