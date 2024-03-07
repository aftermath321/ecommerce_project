import { useState } from "react";
import HeaderLight from "../components/HeadAndFoot/HeaderLight";
import Footer from "../components/HeadAndFoot/Footer";
import AddProduct from "../components/Product/AddProduct";

const AddProductPage = () => {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <AddProduct />
      <Footer />
    </>
  );
};

export default AddProductPage;
