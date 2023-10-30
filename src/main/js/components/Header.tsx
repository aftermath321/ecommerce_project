import React from "react";

const Header = () => {
  return (
    <div className="fixed top-0 w-full bg-black/10 h-[100px] flex flex-row justify-between p-4 font-medium border-white/10 border-b-2 border-solid">
      {/* Left */}
      <div className="left-0 flex flex-row">
        <div className="p-4 font-extrabold text-white text-4xl cursor-pointer">
          H
        </div>
        <div className="p-4 font-extrabold text-white text-2xl cursor-pointer">
          HomeOFFFICE
        </div>
        <div className="p-4 flex">
          <ul className="flex flex-row gap-4">
            <li className="text-white self-center cursor-pointer ">
              Our locations
            </li>
            <li className="text-white self-center cursor-pointer">Store</li>
            <li className="text-white self-center cursor-pointer">Office</li>
            <li className="text-white self-center cursor-pointer">
              Home Office
            </li>
          </ul>
        </div>
      </div>

      {/* Right */}
      <div className="right-0 flex flex-row">
        <ul className="flex flex-row gap-4">
          <li className="text-white self-center cursor-pointer">About</li>
          <li className="text-white self-center cursor-pointer">Contact Us</li>
          <li className="text-white self-center">
            <div className="flex gap-2">
              <input
                placeholder="Search products"
                className="p-1 rounded-md cursor-pointer"
              ></input>
              <button className="bg-yellow-300 px-3 rounded-md text-black font-bold cursor-pointer">
                &gt;
              </button>
            </div>
          </li>
          <li className="text-white self-center cursor-pointer">Cart</li>
          <li className="text-white self-center cursor-pointer">Profile</li>
        </ul>
      </div>
    </div>
  );
};

export default Header;
