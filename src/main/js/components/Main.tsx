import React from "react";

const Main = () => {
  return (
    <div className="relative w-full h-screen p-0 m-0 shadow-bigShadow">
      <div
        className="w-[100%] h-[100%] flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 absolute w-full h-full brightness-75 object-cover"
          src="./src/main/static/public/homeOF.jpg"
        />
        <div className=" w-[70%] h-[70vh] flex flex-col justify-center gap-10 relative text-shadow-sm">
          <p className="text-white text-lg md:text-2xl font-semibold ">
            Office & Home Office furniture
          </p>
          <p className="text-white font-bold text-2xl md:text-6xl text-shadow-lg">
            Improve workplace, improve results - <br /> all on a budget!
          </p>
          <button className="bg-yellow-400 md:px-10  p-1 md:p-2 w-[150px] md:w-[250px] hover:bg-yellow-600 duration-200 rounded-md text-black font-bold cursor-pointer shadow-button">
            Visit Store
          </button>
        </div>
      </div>
    </div>
  );
};

export default Main;
