import { BsClock, BsFillPersonFill, BsTruck } from "react-icons/bs";
import { BiMoney } from "react-icons/bi";

const Features = () => {
  return (
    <div className="w-full bg-gray-100 flex flex-col md:flex-row p-10 justify-center md:justify-around border-solid border-y-[1px] border-gray-400">
      <div className=" h-[80%] w-full flex flex-col py-6 justify-center items-center">
        <div className="flex flex-row gap-2 font-bold text-lg">
          <span className="text-yellow-400" aria-label="Clock icon">
            <BsClock size={30} />
          </span>
          Customer Suport
        </div>
        <p className="font-medium text-md ">All day, every day, 24/7</p>
      </div>

      <div className="h-[80%] w-full flex flex-col py-6 justify-center items-center">
        <div className="flex flex-row gap-2 font-bold text-lg">
          <span className="text-yellow-400" aria-label="Truck icon">
            <BsTruck size={30} />
          </span>
          Free shipping
        </div>
        <p className="font-medium text-md ">Shipping is on us!</p>
      </div>

      <div className="h-[80%] w-full flex flex-col py-6 justify-center items-center">
        <div className="flex flex-row gap-2 font-bold text-lg">
          <span className="text-yellow-400" aria-label="Money icon">
            <BiMoney size={30} />
          </span>
          Seasonal sales
        </div>
        <p className="font-medium text-md ">Big sales, often!</p>
      </div>

      <div className="h-[80%] w-full flex flex-col py-6 justify-center items-center">
        <div className="flex flex-row gap-2 font-bold text-lg">
          <span className="text-yellow-400" aria-label="Person icon">
            <BsFillPersonFill size={30} />
          </span>
          Member discounts
        </div>
        <p className="font-medium text-md ">Join the club and save money</p>
      </div>
    </div>
  );
};

export default Features;
