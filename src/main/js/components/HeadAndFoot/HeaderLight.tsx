import { GiHamburgerMenu } from "react-icons/gi";
import { AiOutlineShoppingCart } from "react-icons/ai";
import { BsFillPersonFill } from "react-icons/bs";
import { Link } from "react-router-dom";
import { SetStateAction, useState } from "react";
import CartMenu from "../CartMenu/CartMenu";
import MobileMenu from "../Mobile/MobileMenu";

const HeaderLight = (props: {
  mobileMenu: boolean;
  mobileMenuSetter: React.Dispatch<SetStateAction<boolean>>;
}) => {
  const [profileState] = useState<boolean>(true);
  const [cartMenu, setCartMenu] = useState<boolean>(false);
  const [search, setSearch] = useState<string>("");

  const mobileMenu = (): JSX.Element => {
    if (props.mobileMenu) {
      return <MobileMenu menuToggle={props.mobileMenuSetter} />;
    } else {
      return <></>;
    }
  };
  const profileMenu = (): JSX.Element => {
    if (profileState) {
      return (
        // <div className="fixed bg-white w-[100px] h-[100px] z-60 top-0 block duration-300">

        // </div>
        <></>
      );
    } else {
      return <></>;
    }
  };
  const cartMenuToggle = (): JSX.Element => {
    return (
      <>
        <CartMenu toggleMenu={setCartMenu} />
      </>
    );
  };

  return (
    <>
      {profileMenu()}
      {mobileMenu()}
      {/* Mobile Display */}
      <div className="flex flex-row lg:hidden bg-white border-white/10 border-b-2 border-solid sticky z-10 top-0 w-full h-[75px]">
        <div className="p-4 font-extrabold text-black text-3xl cursor-pointer group-hover:scale-110 duration-200">
          <Link to="/">H</Link>
        </div>
        <div className="p-4 py-6 font-extrabold text-black text-xl cursor-pointer group-hover:text-yellow-500 duration-200">
          <Link to="/"> HomeOFFFICE</Link>
        </div>
        <div className="flex flex-row p-4 absolute right-0 ">
          <span className="text-black p-2" onClick={() => setCartMenu(true)}>
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
      <div className="hidden z-10 top-0 w-full bg-white h-[75px] lg:flex flex-row justify-between p-4 border-black/10 border-b-2 border-solid  font-light">
        {/* Left */}
        <div className="left-0 flex flex-row">
          <div className="group flex flex-row">
            <div className="p-4 font-extrabold text-black text-4xl cursor-pointer group-hover:scale-110 duration-200">
              <Link to="/">H</Link>
            </div>
            <div className="p-4 font-extrabold text-black text-2xl cursor-pointer group-hover:text-yellow-500 duration-200">
              <Link to="/"> HomeOFFFICE</Link>
            </div>
          </div>
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
              <Link to="/about-us">About</Link>
            </li>
            <li className="text-black self-center cursor-pointer hover:text-yellow-500 hover:underline duration-200">
              Contact Us
            </li>
            <li className="text-black self-center hover:text-yellow-500 duration-200 ">
              <div className="flex gap-2">
                <input
                  value={search}
                  placeholder="Search products..."
                  onChange={(event) => setSearch(event.target.value)}
                  className="p-1 rounded-md  bg-black/10 cursor-pointer font-light px-2 hover:cursor-text border-[1px] border-black/10"
                ></input>

                <Link to={"/product/search?phrase=" + search} className="">
                  <button className="bg-yellow-400 hover:bg-yellow-600  h-[100%] duration-200 px-3 rounded-md active:translate-y-[2px] text-black font-bold cursor-pointer border border-white shadow-button">
                    &gt;
                  </button>
                </Link>
              </div>
            </li>
            <li
              className="text-black self-center cursor-pointer hover:text-yellow-500 duration-200"
              onClick={() => setCartMenu(true)}
            >
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

      {/* Cart */}
      {cartMenu ? cartMenuToggle() : <></>}
    </>
  );
};
export default HeaderLight;
