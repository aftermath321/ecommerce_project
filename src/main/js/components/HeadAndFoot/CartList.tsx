import React from "react";
import CartItem from "./CartItem";
import { Product } from "../../../types/Product";

const CartList = (props: {product:Product | undefined}) => {
  return (
    <div className="flex flex-col gap-2">
      <CartItem product={props.product} />
      <div className="w-[100%] h-[1px] bg-black"></div>
      <CartItem product={props.product} />
      <div className="w-[100%] h-[1px] bg-black"></div>
      <CartItem product={props.product} />
      <div className="w-[100%] h-[1px] bg-black"></div>
      <div className="flex flex-row justify-between py-4">
        <p className="text-3xl">Total:</p>
        <p className="text-4xl border-black border-b-[1px]">90.15</p>
      </div>
    </div>
  );
};

export default CartList;
