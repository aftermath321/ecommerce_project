import {
  AiFillFacebook,
  AiOutlineInstagram,
  AiFillYoutube,
  AiFillTwitterCircle,
} from "react-icons/ai";
import { Link } from "react-router-dom";

const Footer = () => {
  return (
    <>
      <div className="relative bottom-0 bg-white lg:h-[135px] w-[100%] px-[10%] grid sm:grid-cols-1 md:grid-cols-2 lg:grid-cols-4 p-4 gap-4 border-t-[1px] border-black/25 border-solid">
        <div className="flex flex-col  items-center justify-evenly gap-4">
          <Link to="/">
            <div className="group flex flex-row flex-start ">
              <div className="p-4 font-extrabold text-black text-4xl cursor-pointer group-hover:scale-110 duration-200">
                H
              </div>
              <div className="p-4 font-extrabold text-black text-2xl cursor-pointer group-hover:text-yellow-500 duration-200">
                HomeOFFFICE
              </div>
            </div>
          </Link>
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
          <h1 className="text-xl md:text-2xl font-bold ">About Us</h1>
          <ul className="items-center flex flex-col">
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline">
              <Link to="/about-us">About us</Link>
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Contact
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Careers
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Our Shops
            </li>
          </ul>
        </div>
        <div className="items-center justify-center gap-4 flex flex-col">
          <h1 className="text-xl md:text-2xl font-bold ">Categories</h1>
          <ul className="items-center flex flex-col">
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Tables
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Chairs
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Shelves
            </li>
            <li className="text-gray-500 cursor-pointer hover:text-gray-700 hover:underline ">
              Accessories
            </li>
          </ul>
        </div>

        <div className="items-center justify-center gap-4 flex flex-col">
          <h1 className="text-xl md:text-2xl font-bold ">Information</h1>
          <ul className="items-center flex flex-col">
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
      <div className="relative flex bottom-0 text-gray-500 justify-center align-middle w-[100%] px-[10%] h-[5vh] p-4 py-8">
        <p>Copyright © 2023 All rights reserved</p>
      </div>
    </>
  );
};

export default Footer;
