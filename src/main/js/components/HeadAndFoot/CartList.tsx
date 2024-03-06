import React, { useState } from "react";
import CartItem from "./CartItem";
import { Product } from "../../../types/Product";

const CartList = (props: { product: Product[] }) => {
  let [price, setPrice] = useState<number>(0);

  const renderList = (): JSX.Element => {
    let tempPrice = 0;

    for (let i = 0; i > props.product.length; i++) {
      tempPrice += props.product[i].price;
    }
    // setPrice(tempPrice);

    if (props.product.length === 0) {
      return <div className="w-[100%] h-[150px]"></div>;
    } else {
      return (
        <ul>
          {props.product.map((item) => {
            return (
              <li key={item.id}>
                <CartItem product={item} />
              </li>
            );
          })}
        </ul>
      );
    }
  };

  return (
    <div className="flex flex-col gap-2">
      {renderList()}
      <div className="flex flex-row justify-between py-4">
        <p className="text-3xl">Total:</p>
        <p className="text-4xl border-black border-b-[1px]">{price}</p>
      </div>
    </div>
  );
};

export default CartList;
