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
    getProduct(3).then((data) => {
      setProduct(data);
    });
  }, []);

  return (
    <div className="relative w-full h-screen p-0 m-0 font-">
      <div
        className="w-[100%] h-[100%] flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 z-[-10] absolute w-full h-full brightness-75 object-cover"
          src=".././src/main/static/public/homeOF.jpg"
        />
        <div className="bg-black/80 w-[90%] h-[100%] text-white  text-5xl">
          ASDASDASDASD
        </div>
      </div>
    </div>
  );
};

export default ProductView;
