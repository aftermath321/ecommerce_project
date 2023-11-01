import React from "react";
import Header from "./Header";

const Main = () => {
  return (
    <div className="relative w-full h-screen p-0 m-0">
      <Header />
      {/* <div className="backdrop-brightness-75 bg-black w-[100%] h-[100%]"> */}
      <div
        className="w-[100%] h-[100%] flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 absolute w-full h-full brightness-75 object-cover"
          src="./src/main/static/public/homeOF.jpg"
        />
        <div className=" w-[70%] h-[70vh] flex flex-col justify-center gap-10 relative top-[-10%]">
          <p className="text-white text-2xl ">Office & Home Office furniture</p>
          <p className="text-white font-bold text-6xl text-shadow-lg">
            Improve workplace, improve results - <br /> all on a budget!
          </p>
          {/* bg-white hover:bg-gray-100 text-gray-800 font-semibold py-2 px-4 border border-gray-400 rounded shadow */}
          <button className="bg-yellow-300 p-2 px-10 w-[250px] rounded-md text-black font-bold cursor-pointer border border-black shadow">
            Visit Store
          </button>
        </div>
      </div>
      {/* </div> */}
    </div>
  );
};

export default Main;
