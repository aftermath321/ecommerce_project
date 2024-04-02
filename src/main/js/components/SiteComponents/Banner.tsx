import React from "react";

const Banner = () => {
  return (
    <div className="w-[100%] h-[70vh] h-max-[800px] relative ">
      <div className="flex relative z-10 flex-col gap-4 h-[80%] justify-center items-center ">
        <h1 className="text-xl text-white p-2">
          Our recommendation
        </h1>
        <h1 className="text-5xl text-white p-4">
          Browse the newest collection!
        </h1>
        <button className="bg-yellow-400 md:px-10  p-4 md:p-2 w-[150px] md:w-[250px] hover:bg-yellow-600 duration-200 rounded-md text-black font-bold cursor-pointer shadow-button">
          Visit Store
        </button>
      </div>
      <img
        className="inset-0 absolute w-full h-full brightness-75 object-cover"
        src="./src/main/static/public/office5.jpg"
      />
    </div>
  );
};

export default Banner;
