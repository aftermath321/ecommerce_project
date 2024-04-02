import React from "react";

const Banner = () => {
  return (
    <div className="w-[100%] h-[60vh] h-max-[700px] relative ">
      <div className="flex relative z-10 flex-col gap-6 h-[80%] justify-center items-center ">
        <h1 className="text-xl text-white p-2">Our recommendation</h1>
        <h1 className="text-8xl font-bold text-white p-6">
          Browse the newest collection!
        </h1>
        <button className="bg-yellow-400 md:px-10  p-6 md:p-2 w-[150px] md:w-[250px] hover:bg-yellow-600 duration-200 rounded-md text-black font-light text-xl cursor-pointer shadow-button">
          Explore
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
