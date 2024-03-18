import React, { SetStateAction } from 'react'
import { RxCross1 } from 'react-icons/rx';
import { Link } from 'react-router-dom';

const MobileMenu = (props: {
  menuToggle: React.Dispatch<SetStateAction<boolean>>;
}) => {
  return (
    <div className="w-full h-[100vh] fixed top-0 left-0 bg-black/75 z-50">
      <span
        className="absolute text-white z-60 top-[5%] right-[10%]"
        onClick={() => props.menuToggle(false)}
      >
        <RxCross1 size={40} />
      </span>
      <h1 className="text-white text-5xl absolute left-[10%] top-[5%]">H</h1>
      <ul className="w-[90%] h-[80%] font-bold gap-4 text-white text-3xl justify-center flex flex-col items-center">
        <li className="active:text-yellow-400">
          <Link to="/sign-up">Sign up</Link>
        </li>
        <li className="active:text-yellow-400">Login</li>
        <li className="active:text-yellow-400">Locations</li>
        <li className="active:text-yellow-400">Shop</li>
        <li className="active:text-yellow-400">Office</li>
        <li className="active:text-yellow-400">Home Office</li>
        <li className="active:text-yellow-400">
          <Link to="/about-us">About us</Link>
        </li>
        <li className="active:text-yellow-400">Contact</li>
      </ul>
    </div>
  );
};

export default MobileMenu