import React, { useState } from "react";
import { Form } from "react-router-dom";

type ProductTemp = {
  name: "";
  price: number;
  producer: "";
  imagePath: "";
  rating: number;
};

const AddProduct = () => {
  const [tempProduct, setTempProduct] = useState<ProductTemp | null>(null);

  const handleSubmit = () => {};

  return (
    <div className="w-[100%] h-[100vh] ">
      <div className="w-[80%] h-[100%] bg-gray-200 left-0 right-0 mx-auto">
        <form className="flex flex-col w-[80%] h-[100%] gap-4 bg-white mx-auto left-0 right-0 justify-center text-black text-lg align-middle text-center">
          <label>Name</label>
          <input
            type="text"
            className=" shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg self-center "
          ></input>
          <label>Price</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center "
          ></input>
          <label>Producer</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center "
          ></input>
          <label>Image Path</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center "
          ></input>
          <label>Rating</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center "
          ></input>

          <button
            type="submit"
            className="w-[200px] h-[75px] shadow-button rounded-lg p-4 px-8 bg-yellow-300 hover:bg-yellow-400 duration-300 mx-auto left-0 right-0"
          >
            Add Product{" "}
          </button>
        </form>
      </div>
    </div>
  );
};

export default AddProduct;
