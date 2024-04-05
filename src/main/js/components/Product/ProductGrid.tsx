import { useEffect } from "react";
import ProductCard from "./ProductCard";
import { Product } from "../../../types/Product";
import { useState } from "react";
import { Link } from "react-router-dom";
import { getProducts } from "../../api/productsAPI";
import shuffleArray from "../../functions/shuffleArray";

const ProductGrid = () => {
  const [productList, setProductList] = useState<Product[]>([]);
  const [isLoading, setIsLoading] = useState<boolean>(true);
  const [renderMore, setRenderMore] = useState<boolean>(false);

  useEffect(() => {
    setIsLoading(true);
    getProducts().then((data) => {
      setProductList(shuffleArray(data));
      setIsLoading(false);
    });
  }, []);

  const buttonRender = (): JSX.Element => {
    if (renderMore === false) {
      return (
        <div className="w-full h-[5%] flex justify-center p-4">
          <button
            className="bg-yellow-400 hover:bg-yellow-600 duration-200 p-5 rounded-md shadow-button"
            onClick={() => setRenderMore(true)}
          >
            View more
          </button>
        </div>
      );
    } else {
      return <></>;
    }
  };

  const renderGrid = (): JSX.Element => {
    if (isLoading) {
      return <>Loading</>;
    } else if (!isLoading && renderMore) {
      return (
        <div className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
          <ul className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
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
    } else {
      return (
        <div className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
          <ul className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
            {productList.slice(0, 10).map((item) => {
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
          <h1 className=" text-5xl justify-center items-center flex font-extrabold text-center">
            Make your life comfortable
          </h1>
        </div>
        {/* Content */}
        {renderGrid()}
        {/* Bottom */}
        {buttonRender()}
      </div>
    </div>
  );
};

export default ProductGrid;
