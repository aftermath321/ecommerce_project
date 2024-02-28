import React, { useState } from "react";
import HeaderDark from "../components/HeaderDark";
import HeaderLight from "../components/HeaderLight";
import Footer from "../components/Footer";
import Main from "../components/Admin/Main";

const Admin = () => {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <Main />
      <Footer />
    </>
  );
};

export default Admin;
