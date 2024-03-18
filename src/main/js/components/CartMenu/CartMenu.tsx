import { useState, useEffect, SetStateAction } from "react";
import { Product } from "../../../types/Product";
import { getProducts } from "../../api/productsAPI";
import CartList from "./CartList";
import { RxCross1 } from "react-icons/rx";

const CartMenu = (props: {
  toggleMenu: React.Dispatch<SetStateAction<boolean>>;
}) => {
  const [product, setProduct] = useState<Product[]>([]);

  useEffect(() => {
    getProducts().then((data) => {
      setProduct(data);
    });
  }, []);

  return (
    <div className="bg-black/60 fixed top-0 right-0 z-10 w-[100vw] h-[100vh]">
      <div className="absolute right-0 top-0 z-10 bg-white h-[100vh] w-[100vw] md:w-[40%] lg:w-[30%]">
        <div className="h-[100px] w-[100%] flex flex-col overflow-visible  ">
          <span
            className="cursor-pointer  w-[50px] h-[50px] p-4"
            onClick={() => props.toggleMenu(false)}
          >
            <RxCross1 size={40} />
          </span>
          <h2 className="text-4xl text-center  align-middle self-center mx-auto left-0 right-0 ">
            My Cart
          </h2>
        </div>
        <div className="w-[90%] h-[80%]  left-0 right-0 rounded-lg overflow-y-scroll py-4 px-2 mx-2">
          <CartList product={product} />
        </div>
      </div>
    </div>
  );
};

export default CartMenu;
