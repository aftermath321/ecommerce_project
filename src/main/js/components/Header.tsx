import React from "react";

const Header = () => {
  return (
    <div className="absolute z-10 top-0 w-full bg-black/10 h-[100px] flex flex-row justify-between p-4 border-white/10 border-b-2 border-solid font-semibold">
      {/* Left */}
      <div className="left-0 flex flex-row">
        <div className="group flex flex-row">
          <div className="p-4 font-extrabold text-white text-4xl cursor-pointer group-hover:scale-110 duration-200">
            H
          </div>
          <div className="p-4 font-extrabold text-white text-2xl cursor-pointer group-hover:text-yellow-500 duration-200">
            HomeOFFFICE
          </div>
        </div>
        <div className="p-4 flex">
          <ul className="flex flex-row gap-4">
            <li className="text-white self-center cursor-pointer  hover:text-yellow-500 duration-200">
              Our locations
            </li>
            <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
              Store
            </li>
            <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
              Office
            </li>
            <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
              Home Office
            </li>
          </ul>
        </div>
      </div>

      {/* Right */}
      <div className="right-0 flex flex-row">
        <ul className="flex flex-row gap-4">
          <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
            About
          </li>
          <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
            Contact Us
          </li>
          <li className="text-white self-center hover:text-yellow-500 duration-200">
            <div className="flex gap-2">
              <input
                placeholder="Search products..."
                className="p-1 rounded-md cursor-pointer px-2"
              ></input>
              <button className="bg-yellow-300 hover:bg-yellow-500 duration-200 px-3 rounded-md text-black font-bold cursor-pointer border border-black shadow">
                &gt;
              </button>
            </div>
          </li>
          <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
            Cart
          </li>
          <li className="text-white self-center cursor-pointer hover:text-yellow-500 duration-200">
            Profile
          </li>
        </ul>
      </div>
    </div>
  );
};

export default Header;
