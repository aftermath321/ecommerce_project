import React, { useState } from "react";
import SignUpForm from "../components/Admin/SignUpForm";
import Header from "../components/HeadAndFoot/HeaderLight";
import Footer from "../components/HeadAndFoot/Footer";

const SignUpPage = () => {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <Header mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <SignUpForm />
      <Footer />
    </>
  );
};

export default SignUpPage;
