import React from "react";
import {AiFillStar, AiOutlineStar} from 'react-icons/ai'

const ProductCard = () => {
  return (
    <div className="bg-white  w-[300px] h-[400px]  xl:w-[400px] xl:h-[450px] place-self-center">
      <div
        className="w-[100%] h-[80%]  flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 absolute w-full h-full brightness-75 object-cover"
          src="./src/main/static/public/homeOF.jpg"
        />
      </div>
      <div className="w-full h-[20%]">
        <h2 className="text-2xl flex justify-start">Working product title</h2>
        <h3 className="text-lg text-gray-500 flex justify-start">$55.30</h3>
        <div className="flex flex-row text-gray-700">
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiOutlineStar />
        </div>
      </div>
    </div>
  );
};

export default ProductCard;
