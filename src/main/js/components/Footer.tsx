import React from "react";
import {
  AiFillFacebook,
  AiOutlineInstagram,
  AiFillYoutube,
  AiFillTwitterCircle,
} from "react-icons/ai";

const Footer = () => {
  return (
    <>
      <div className="relative bottom-0 bg-white  h-[30vh] w-[100%] px-[10%] grid sm:grid-cols1 md:grid-cols-2 lg:grid-cols-4">
        <div className="flex flex-col  items-center justify-evenly">
          <div className="group flex flex-row flex-start ">
            <div className="p-4 font-extrabold text-black text-4xl cursor-pointer group-hover:scale-110 duration-200">
              H
            </div>
            <div className="p-4 font-extrabold text-black text-2xl cursor-pointer group-hover:text-yellow-500 duration-200">
              HomeOFFFICE
            </div>
          </div>
          <ul className="flex flex-row gap-4">
            <li>
              <AiFillFacebook
                className="text-gray-500 hover:text-yellow-500"
                size={30}
              />
            </li>
            <li>
              <AiOutlineInstagram
                className="text-gray-500 hover:text-yellow-500"
                size={30}
              />
            </li>
            <li>
              <AiFillTwitterCircle
                className="text-gray-500 hover:text-yellow-500"
                size={30}
              />
            </li>
            <li>
              <AiFillYoutube
                className="text-gray-500 hover:text-yellow-500"
                size={30}
              />
            </li>
          </ul>
        </div>
        <div className="items-center justify-center gap-4 flex flex-col">
          <h1 className="text-2xl font-bold ">About Us</h1>
          <ul>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              About Us
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Contact
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Carees
            </li>
          </ul>
        </div>
        <div className="items-center justify-center gap-4 flex flex-col">
          <h1 className="text-2xl font-bold ">Categories</h1>
          <ul>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Tables
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Chairs
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Shelves
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Accessories
            </li>
          </ul>
        </div>
        <div className="items-center justify-center gap-4 flex flex-col">
          <h1 className="text-2xl font-bold ">Information</h1>
          <ul>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              FAQs
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Refund Policy
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Privacy Policy
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 ">
              Terms & Conditions
            </li>
          </ul>
        </div>
      </div>
      <div className="relative flex bottom-0 text-gray-500 justify-center align-middle w-[100%] px-[10%] h-[5vh]">
        <p>Copyright © 2023 All rights reserved</p>
      </div>
    </>
  );
};

export default Footer;
