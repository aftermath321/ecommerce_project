import { GiHamburgerMenu } from "react-icons/gi";
import { AiOutlineShoppingCart } from "react-icons/ai";
import { BsFillPersonFill } from "react-icons/bs";
import { RxCross1 } from "react-icons/rx";
import { Link } from "react-router-dom";
import { useState } from "react";

const HeaderLight = (props: {
  mobileMenu: boolean;
  mobileMenuSetter: Function;
  dark: boolean;
}) => {
  const [profileMenu, setProfileMenu] = useState<boolean>(false);

  // // Profile Menu
  // if (profileMenu) {
  //   const profileMenu = (): JSX.Element => {
  //     return <div className="absolute bg-white w-[200px] h-[200px] z-60 ">

  //     </div>;
  //   };
  // } else {
  //   return <></>
  // }


    // light background

    const mobileMenuLight = (): JSX.Element => {
      if (props.mobileMenu) {
        return (
          <div className="w-full h-[100vh] fixed top-0 left-0 bg-black/75 z-50">
            <span
              className="absolute text-white z-60 top-[5%] right-[10%]"
              onClick={() => props.mobileMenuSetter(false)}
            >
              <RxCross1 size={40} />
            </span>
            <h1 className="text-white text-5xl absolute left-[10%] top-[5%]">
              H
            </h1>
            <ul className="w-[90%] h-[80%] font-bold gap-4 text-white text-3xl justify-center flex flex-col items-center">
              <li className="active:text-yellow-400">
                <Link to="/sign-up">Sign up</Link>
              </li>
              <li className="active:text-yellow-400">Login</li>
              <li className="active:text-yellow-400">Locations</li>
              <li className="active:text-yellow-400">Shop</li>
              <li className="active:text-yellow-400">Office</li>
              <li className="active:text-yellow-400">Home Office</li>
              <li className="active:text-yellow-400">About us</li>
              <li className="active:text-yellow-400">Contact</li>
            </ul>
          </div>
        );
      } else {
        return <></>;
      }
    };

    return (
      <>
        {mobileMenuLight()}
        {/* Mobile Display */}
        <div className="flex flex-row md:hidden border-black/10 border-b-2 border-solid relative z-10 top-0 w-[full] h-[75px]">
            <div className="p-4 font-extrabold text-black text-3xl cursor-pointer group-hover:scale-110 duration-200">
              <Link to="/"> H</Link>
            </div>
            <div className="p-4 py-6 font-extrabold text-black text-xl cursor-pointer group-hover:text-yellow-500 duration-200 ">
              <Link to="/"> HomeOFFFICE</Link>
            </div>
          <div className="flex flex-row p-4 absolute right-0 ">
            <span className="text-black p-2">
              <AiOutlineShoppingCart size={30} />
            </span>
            <span
              className="text-black p-2"
              onClick={() => props.mobileMenuSetter(true)}
            >
              <GiHamburgerMenu size={30} />
            </span>
          </div>
        </div>

        {/* Normal Display */}
        <div className="hidden z-10 top-0 w-full bg-white/10 h-[100px] md:flex flex-row justify-between p-4 border-black/10 border-b-2 border-solid  font-light">
          {/* Left */}
          <div className="left-0 flex flex-row">
            <Link to="/">
              <div className="group flex flex-row">
                <div className="p-4 font-extrabold text-black text-4xl cursor-pointer group-hover:scale-110 duration-200">
                  H
                </div>
                <div className="p-4 font-extrabold text-black text-2xl cursor-pointer group-hover:text-yellow-500 duration-200">
                  HomeOFFFICE
                </div>
              </div>
            </Link>
            <div className="p-4 flex">
              <ul className="flex flex-row gap-4">
                <li className="text-black self-center cursor-pointer  hover:text-yellow-500  hover:underline duration-200">
                  Our locations
                </li>
                <li className="text-black self-center cursor-pointer hover:text-yellow-500 hover:underline duration-200">
                  Store
                </li>
                <li className="text-black self-center cursor-pointer hover:text-yellow-500 hover:underline duration-200">
                  Office
                </li>
                <li className="text-black self-center cursor-pointer hover:text-yellow-500 hover:underline duration-200">
                  Home Office
                </li>
              </ul>
            </div>
          </div>

          {/* Right */}
          <div className="right-0 flex flex-row font-light">
            <ul className="flex flex-row gap-4">
              <li className="text-black self-center cursor-pointer hover:text-yellow-500 hover:underline duration-200">
                About
              </li>
              <li className="text-black self-center cursor-pointer hover:text-yellow-500 hover:underline duration-200">
                Contact Us
              </li>
              <li className="text-black self-center hover:text-yellow-500 duration-200">
                <div className="flex gap-2">
                  <input
                    placeholder="Search products..."
                    className="p-1 rounded-md cursor-pointer font-light px-2 border-[1px] border-solid border-black"
                  ></input>
                  <button className="bg-yellow-300 hover:bg-yellow-500 duration-200 px-3 rounded-md text-black font-bold cursor-pointer  shadow">
                    &gt;
                  </button>
                </div>
              </li>
              <li className="text-black self-center cursor-pointer hover:text-yellow-500 duration-200">
                <AiOutlineShoppingCart size={30} />
              </li>
              <li className="text-black self-center cursor-pointer hover:text-yellow-500 duration-200">
                <Link to="/sign-up">
                  <BsFillPersonFill size={30} />
                </Link>
              </li>
            </ul>
          </div>
        </div>
      </>
    );
  
};
export default HeaderLight;
