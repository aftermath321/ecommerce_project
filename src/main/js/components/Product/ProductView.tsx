import { Product } from "../../../types/Product";
import { useState } from "react";
import { BsCashCoin } from "react-icons/bs";
import RatingSystem from "./RatingSystem";

const ProductView = (props: { product: Product | undefined }) => {
  const [count, setCount] = useState<number>(0);
  const [display, setDisplay] = useState<boolean>(true);
  const [zoomed, setZoomed] = useState<boolean>(false);

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
  const displayButtons = () => {
    if (display) {
      return (
        <div>
          <button
            className="font-bold border-t-2 border-gray-700 p-4"
            onClick={() => setDisplay(true)}
          >
            Description
          </button>
          <button className="font-bold p-4" onClick={() => setDisplay(false)}>
            Reviews (0)
          </button>
        </div>
      );
    } else {
      return (
        <div>
          <button className="font-bold p-4" onClick={() => setDisplay(true)}>
            Description
          </button>
          <button
            className="font-bold border-t-2 border-gray-700 p-4"
            onClick={() => setDisplay(false)}
          >
            Reviews (0)
          </button>
        </div>
      );
    }
  };
  const switchDisplay = () => {
    if (display) {
      return (
        <>
          <p className="text-gray-500 font-extralight">
            Sed ut perspiciatis unde omnis iste natus error sit voluptatem
            accusantium doloremque laudantium, totam rem aperiam, eaque ipsa
            quae ab illo inventore veritatis et quasi architecto beatae vitae
            dicta sunt explicabo.
          </p>
          <br />
          <p className="text-gray-500 font-extralight">
            Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut
            fugit, sed quia consequuntur magni dolores eos qui ratione
            voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem
            ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non
            numquam eius modi tempora incidunt ut labore et dolore magnam
            aliquam quaerat voluptatem.
          </p>
          <br />
          <p className="text-gray-500 font-extralight">
            Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis
            suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis
            autem vel eum iure reprehenderit qui in ea voluptate velit esse quam
            nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo
            voluptas nulla pariatur?
          </p>
        </>
      );
    } else {
      return (
        <>
          <div>
            <h1 className="text-5xl text-black">W.I.P.</h1>
          </div>
        </>
      );
    }
  };
  const zoomImage = () => {
    if (zoomed) {
      return (
        <div className="absolute top-0 left-0 w-full h-screen z-50">
          <img
            src={props.product?.imagePath}
            className="fixed top-[10vh] z-50 mx-auto left-0 right-0 md:h-[80vh] md:w-auto w-[90vw] h-auto my-5"
            onClick={() => setZoomed(false)}
          ></img>

          <div className="top-0 fixed bg-black/50 z-40 w-[100vw] h-full"></div>
        </div>
      );
    } else {
      return <></>;
    }
  };

  return (
    <>
      {zoomImage()}
      <div className=" w-[80vw] relative mx-auto left-0 right-0 my-10 flex flex-col">
        <div className="flex flex-col md:flex-row w-full justify-center gap-x-3 gap-y-10">
          <img
            src={props.product?.imagePath}
            className="w-[300px] h-[300px] lg:w-[550px] lg:h-[550px] inset-0 object-contain hover:scale-125 duration-300 my-4"
            onClick={() => setZoomed(true)}
          />
          <div className="w-[90vw] lg:w-[550px] lg:h-[550px] flex flex-col gap-3 ">
            <h3 className="text-gray-500">Category</h3>
            <h1 className="text-4xl font-bold">{props.product?.name}</h1>
            <RatingSystem rating={props.product?.rating} />
            <h2 className="text-xl text-gray-700">${props.product?.price}</h2>
            <p className="w-[90%] md:w-[100%] text-gray-600 text-center md:text-start">
              Sed ut perspiciatis unde omnis iste natus error sit voluptatem
              accusantium doloremque laudantium, totam rem aperiam, eaque ipsa
              quae ab illo inventore veritatis et quasi architecto beatae vitae
              dicta sunt explicabo.
            </p>
            <div className="w-[90%] md:w-[100%] flex flex-row gap-4">
              <div className="flex flex-row ">
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
            <div className="w-[90%] md:w-[100%] border-b-[1px] border-solid border-black/20 my-4"></div>
            <div className="relative my-4">
              <div className="absolute top-[-20px] text-black/50 left-5 bg-white p-1">
                Accepted payments
              </div>
              <div className="w-[90%] md:w-[100%] h-[75px] border-[1px] border-solid border-black/20 flex flex-row justify-center items-center gap-4">
                <span className="cursor-pointer">
                  <BsCashCoin size={35} />
                </span>
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
        <div className="w-[80%] border-b-[1px] border-solid border-black/50 mx-auto left-0 right-0 "></div>
        <div className="w-[80%] mx-auto left-0 right-0">
          {displayButtons()}
          {switchDisplay()}
        </div>
      </div>
    </>
  );
};

export default ProductView;
