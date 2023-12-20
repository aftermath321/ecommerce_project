import HeaderDark from "../components/HeaderDark";
import Main from "../components/Main";
import Footer from "../components/Footer";
import Features from "../components/Features";
import ProductGrid from "../components/ProductGrid";
import { useState } from "react";

function MainPage() {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderDark mobileMenu={mobile} mobileMenuSetter={setMobile} dark={true} />
      <Main />
      <ProductGrid />
      <Features />
      <Footer />
    </>
  );
}

export default MainPage;
