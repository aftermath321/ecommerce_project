import HeaderDark from "../components/HeadAndFoot/HeaderDark";
import Main from "../components/Main";
import Footer from "../components/HeadAndFoot/Footer";
import Features from "../components/Features";
import ProductGrid from "../components/Product/ProductGrid";
import { useState } from "react";

function MainPage() {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderDark mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <Main />
      <ProductGrid />
      <Features />
      <Footer />
    </>
  );
}

export default MainPage;
