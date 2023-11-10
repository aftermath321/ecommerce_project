import { Product } from "../../types/Product";
import { useState } from "react";
import { BsCashCoin } from "react-icons/bs";
import RatingSystem from "./RatingSystem";

const ProductView = (props: { product: Product | undefined }) => {
  const [count, setCount] = useState<number>(0);

  const handleCount = () => {
    if (count == 0) {
      setCount(0);
    } else {
      setCount(count - 1);
    }
  };
  const isNanCount = () => {
    if (isNaN(count)) {
      setCount(0);
    } else {
      return count;
    }
  };

  return (
    <div className=" w-[90vw] h-screen relative mx-auto left-0 right-0 my-10">
      <div className="flex flex-col md:flex-row w-full h-full justify-center gap-x-3 gap-y-10 ">
        <img
          src={props.product?.imagePath}
          className="w-[300px] h-[300px] lg:w-[550px] lg:h-[550px] inset-0 object-contain"
        />
        <div className="w-[90vw] lg:w-[550px] lg:h-[550px] flex flex-col gap-3 ">
          <h3 className="text-gray-500">Category</h3>
          <h1 className="text-4xl font-bold">{props.product?.name}</h1>
          <RatingSystem rating={props.product?.rating} />
          <h2 className="text-xl text-gray-700">${props.product?.price}</h2>
          <p className=" text-gray-600 text-center md:text-start">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
            eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
            ad minim veniam, quis nostrud exercitation ullamco laboris.
          </p>
          <div className="flex flex-row gap-4">
            <div className="flex flex-row">
              <button
                className="p-1 px-4 bg-white border-[1px] border-black/25 border-solid cursor-pointer"
                onClick={() => handleCount()}
              >
                -
              </button>
              <input
                className="p-1 px-2 w-[45px] bg-white border-[1px] border-black/25 border-solid cursor-pointer text-center "
                onChange={(e) => setCount(e.target.valueAsNumber)}
                value={isNanCount()}
                type="number"
              />

              <button
                className="p-1 px-4 bg-white border-[1px] border-black/25 border-solid cursor-pointer"
                onClick={() => setCount(count + 1)}
              >
                +
              </button>
            </div>
            <button className="bg-yellow-300 hover:bg-yellow-500 duration-200 px-6 rounded-md text-black shadow cursor-pointer">
              Add to cart
            </button>
          </div>
          <div className="w-[100%] border-b-[1px] border-solid border-black/20 my-4"></div>
          <div className="relative">
            <div className="absolute top-[-20px] text-black/50 left-5 bg-white p-2">
              Accepted payments
            </div>
            <div className="w-[100%] h-[75px] border-[1px] border-solid border-black/20 flex flex-row justify-center items-center gap-4">
              <BsCashCoin size={35} />
              <img
                src="./src/main/static/public/Visa.png"
                className="w-[50px] h-[50px] object-contain cursor-pointer"
              />
              <img
                src="./src/main/static/public/MC.png"
                className="w-[50px] h-[50px] object-contain cursor-pointer"
              />
              <img
                src="./src/main/static/public/AE.png"
                className="w-[50px] h-[50px] object-contain cursor-pointer"
              />
              <img
                src="./src/main/static/public/Disc.png"
                className="w-[50px] h-[50px] object-contain cursor-pointer"
              />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default ProductView;
