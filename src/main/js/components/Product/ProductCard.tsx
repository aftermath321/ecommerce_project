import { Product } from "../../../types/Product";
import RatingSystem from "../Reviews/RatingSystem";

const ProductCard = (props: { product: Product }) => {
  return (
    <div className="bg-white w-[100%] h-[300px] md:h-[350px] lg:h-[500px]  place-self-center shadow-border hover:scale-105 duration-300">
      <div
        className="w-[100%] h-[60%] md:h-[65%] lg:h-[75%] flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 h-[100%] absolute w-full brightness-75 object-cover rounded-lg"
          src={props.product.imagePath}
        />
      </div>
      <div className="w-full h-[35%] md:h-[25%] lg:h-[15%]">
        <h2 className="text-2xl flex justify-start">{props.product.name}</h2>
        <h3 className="text-lg text-gray-500 flex justify-start">
          $ {props.product.price}
        </h3>
        <RatingSystem stars={props.product.rating} />
      </div>
    </div>
  );
};

export default ProductCard;
