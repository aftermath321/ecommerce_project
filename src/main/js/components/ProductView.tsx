import React, { useState, useEffect } from "react";
import { Product } from "../../types/Product";
import { getProduct } from "../api/productsAPI";
import { useParams } from "react-router-dom";

export type Params = {
  id: string;
};

const ProductView = () => {
  const [product, setProduct] = useState<Product>();
  const { id } = useParams<Params>() as Params;

  const idNumber: number = +id;

  useEffect(() => {
    getProduct(idNumber).then((data) => {
      setProduct(data);
    });
    console.log(product);
  }, []);

  return (
    <div className="relative w-full h-screen p-0 m-0 font-">
      <div
        className="w-[100%] h-[100%] flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 absolute w-full h-full brightness-75 object-cover"
          src=".././src/main/static/public/homeOF.jpg"
        />
        <div className=" w-[70%] h-[70vh] flex flex-col justify-center gap-10 relative text-shadow-sm">
          <p className="text-white font-bold text-2xl md:text-6xl text-shadow-lg">
            {product?.name}
          </p>
        </div>
      </div>
    </div>
  );
};

export default ProductView;
