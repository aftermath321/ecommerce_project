import { Product } from "../../../types/Product";

const CartItem = (props: { product: Product }) => {

 
    
    return (
      <div className="w-[100%] h-[150px]  flex flex-row">
        <div>
          <img
            className="inset-0 w-[150px] h-[150px]  brightness-75 object-cover rounded-lg scale-90"
            src={props.product.imagePath}
          />
        </div>
        <div className="w-[450px] h-[100%] flex flex-row  justify-between">
          <div className="align-middle flex flex-col self-center">
            <p className="text-3xl ">{props.product.name}</p>
            <p className="text-xl text-gray-500">{props.product.producer}</p>
          </div>
          <div className="text-2xl self-center">{props.product.price}</div>
        </div>
      </div>
    );
  
};

export default CartItem;
