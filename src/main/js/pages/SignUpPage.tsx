import React, { useState } from "react";
import SignUpForm from "../components/SignUpForm";
import Header from "../components/HeaderLight";
import Footer from "../components/Footer";

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
