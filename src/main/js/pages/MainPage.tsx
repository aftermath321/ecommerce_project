import React from "react";
import Header from "../components/Header";
import Main from "../components/Main";
import Footer from "../components/Footer";
import Features from "../components/Features"
import ProductGrid from "../components/ProductGrid";

function MainPage() {
  return (
    <>
      <Header />
      <Main />
      <ProductGrid />
      <Features />
      <Footer/>
    </>
  );
}

export default MainPage;
