import React, { ReactNode, useState } from "react";
import CartItem from "./CartItem";
import { Product } from "../../../types/Product";

const CartList = (props: { product: Product[]}) => {
  const [price, setPrice] = useState<number>(0.0)
  console.log(props.product)


  const calcPrice = ():void => {
    props.product.forEach((element) => {
      setPrice(element.price)
      
    });

  };

  const listItems = () => {
    
     for (let i = 0; i < props.product.length; i++){
        return (

          <>
          <CartItem product={props.product[i]} />
          <div className="w-[100%] h-[1px] bg-black"></div>
          </>

        )
    }
  }


  return (
    <div className="flex flex-col gap-2">
      {listItems()}
      <div className="flex flex-row justify-between py-4">
        <p className="text-3xl">Total:</p>
        <p className="text-4xl border-black border-b-[1px]">{price}</p>
      </div>
    </div>
  );
};

export default CartList;
