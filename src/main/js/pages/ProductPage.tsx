import React from "react";
import Header from "../components/Header";
import { useState } from "react";
import { Link } from "react-router-dom";

const ProductPage = () => {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      {/* <Header mobileMenu={mobile} mobileMenuSetter={setMobile} /> */}
      <div>
        <Link to="/product/1">afsdfa</Link>
      </div>
    </>
  );
};

export default ProductPage;
