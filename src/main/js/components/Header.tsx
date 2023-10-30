import React from "react";

const Header = () => {
  return (
    <div className="sticky top-0 w-full bg-slate-400 h-[100px] flex flex-row justify-between p-4">
      <div className="left-0 flex flex-row ">
        <div className="p-4 font-extrabold text-white text-4xl">H</div>
        <div className="p-4 font-extrabold text-white text-2xl">
          HomeOFFFICE
        </div>
        <div className="p-4 flex">
          <ul className="flex flex-row gap-4">
            <li className="text-white self-center">Our locations</li>
            <li className="text-white self-center">Store</li>
            <li className="text-white self-center">Office</li>
            <li className="text-white self-center">Home Office</li>
          </ul>
        </div>
      </div>
      <div className="right-0 flex flex-row">
        <ul className="flex flex-row gap-4">
          <li className="text-white self-center">About</li>
          <li className="text-white self-center">Contact Us</li>
          <li className="text-white self-center">
            <div className="flex gap-2">
              <input
                placeholder="Search products"
                className="p-1 rounded-md"
              ></input>
              <button className="bg-yellow-300 px-3 rounded-md text-black font-bold">&gt;</button>
            </div>
          </li>
          <li className="text-white self-center">Cart</li>
          <li className="text-white self-center">Profile</li>
        </ul>
      </div>
    </div>
  );
};

export default Header;
