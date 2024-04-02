import HeaderDark from "../components/HeadAndFoot/HeaderDark";
import Main from "../components/SiteComponents/Main";
import Footer from "../components/HeadAndFoot/Footer";
import Features from "../components/SiteComponents/Features";
import ProductGrid from "../components/Product/ProductGrid";
import { useState } from "react";
import Banner from "../components/SiteComponents/Banner";

function MainPage() {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderDark mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <Main />
      <ProductGrid />
      <Features />
      <Banner />
      <Footer />
    </>
  );
}

export default MainPage;
