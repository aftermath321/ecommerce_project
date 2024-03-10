import { Product } from "../../../types/Product";
import RatingSystem from "../Reviews/RatingSystem";

const ProductCard = (props: { product: Product }) => {
  return (
    <div className="bg-white  w-[300px] h-[400px]  xl:w-[400px] xl:h-[450px] place-self-center shadow-border hover:scale-105 duration-300">
      <div
        className="w-[100%] h-[80%]  flex flex-col justify-center
        items-center relative overflow-hidden"
      >
        <img
          className="inset-0 absolute w-full h-full brightness-75 object-cover rounded-lg"
          src={props.product.imagePath}
        />
      </div>
      <div className="w-full h-[20%]">
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
