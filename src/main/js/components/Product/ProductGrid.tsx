import { useEffect } from "react";
import ProductCard from "./ProductCard";
import { Product } from "../../../types/Product";
import { useState } from "react";
import { Link, LinkProps, Route } from "react-router-dom";
import { getProducts } from "../../api/productsAPI";

const ProductGrid = () => {
  const [productList, setProductList] = useState<Product[]>([]);
  const [isLoading, setIsLoading] = useState<boolean>(true);

  useEffect(() => {
    setIsLoading(true);
    getProducts().then((data) => {
      setProductList(data);
      setIsLoading(false);
    });
  }, []);

  const renderGrid = (): JSX.Element => {
    if (isLoading) {
      return <>Loading</>;
    } else {
      return (
        <div className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
          <ul>
            {productList.map((item) => {
              return (
                <li key={item.id}>
                  <Link to={"/product/" + item.id}>
                    <ProductCard product={item} />
                  </Link>
                </li>
              );
            })}
          </ul>
        </div>
      );
    }
  };

  return (
    <div className="w-full ">
      {/* Wrapper */}
      <div className="h-full w-[95%]  flex flex-col mx-auto left-0 right-0 items-center">
        {/* Title */}
        <div className="w-full h-[5%] py-10">
          <h2 className="text-xl justify-center items-center flex font-bold">
            New products
          </h2>
          <h1 className=" text-5xl justify-center items-center flex font-extrabold">
            Make your life comfortable
          </h1>
        </div>
        {/* Content */}
        {renderGrid()}
        {/* Bottom */}
        <div className="w-full h-[5%] flex justify-center p-4">
          <button className="bg-yellow-400 hover:bg-yellow-600 duration-200 p-5 rounded-md shadow-button">
            View more
          </button>
        </div>
      </div>
    </div>
  );
};

export default ProductGrid;
