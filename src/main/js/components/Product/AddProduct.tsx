import { useState } from "react";
import { postProduct } from "../../api/productsAPI";
import { Product } from "../../../types/Product";

 export type tempProd = {
  id: 'number',
  name: 'string',
  producer: 'string',
  released: 'Date',
  price: 'number',
  rating: 'number',
  imagePath: 'string',
  description: 'string'
};

const AddProduct = () => {
  // const [tempProduct, setTempProduct] = useState<tempProd>(tempProd);
  const [tempName, setTempName] = useState<string>("");
  const [tempSource, setTempSource] = useState<string>("");
  const [tempCompany, setTempCompany] = useState<string>("");
  const [tempDesc, setTempDesc] = useState<string>("");
  const [tempPrice, setTempPrice] = useState<number>(0);
  const [tempRating, setTempRating] = useState<number>(0);

  const handleSubmit = (): void => {
      // postProduct(tempProduct);
    
  };

  return (
    <div className="w-[100%] h-[100vh] ">
      <div className="w-[80%] h-[100%] bg-gray-200 left-0 right-0 mx-auto">
        <form
          className="flex flex-col w-[80%] h-[100%] gap-4 bg-white mx-auto left-0 right-0 justify-center text-black text-lg align-middle text-center"
          onSubmit={() => handleSubmit()}
        >
   
          <label>Name</label>
          <input
            type="text"
            className=" shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg self-center p-2"
            onChange={(event) => setTempName(event.target.value)}
          ></input>
          <label>Price</label>
          <input
            type='number'
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center p-2"
            // onChange={(event) => setTempPrice(event.target.value)}
          />
          <label>Producer</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center p-2"
            onChange={(event) => setTempCompany(event.target.value)}
          ></input>
          <label>Image Path</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center p-2"
            onChange={(event) => setTempSource(event.target.value)}
          ></input>
          <label>Desc</label>
          <input
            type="text"
            className="shadow-bigShadow w-[400px] h-[50px] bg-slate-200 rounded-lg  self-center p-2"
            onChange={(event) => setTempDesc(event.target.value)}
          ></input>

          <button
            type="submit"
            className="w-[200px] h-[75px] shadow-button rounded-lg p-4 px-8 bg-yellow-300 hover:bg-yellow-400 duration-300 mx-auto left-0 right-0"
          >
            Add Product
          </button>
        </form>
      </div>
    </div>
  );
};

export default AddProduct;
