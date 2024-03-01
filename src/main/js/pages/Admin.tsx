import React, { useState } from "react";
import HeaderDark from "../components/HeadAndFoot/HeaderDark";
import HeaderLight from "../components/HeadAndFoot/HeaderLight";
import Footer from "../components/HeadAndFoot/Footer";
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
