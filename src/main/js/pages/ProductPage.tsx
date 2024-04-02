import { useState, useEffect } from "react";
import { Product } from "../../types/Product";
import { getProduct } from "../api/productsAPI";
import { useParams } from "react-router-dom";
import HeaderLight from "../components/HeadAndFoot/HeaderLight";
import ProductView from "../components/Product/ProductView";
import Footer from "../components/HeadAndFoot/Footer";
import Banner from "../components/SiteComponents/Banner";

export type Params = {
  id: string;
};

const ProductPage = () => {
  const [product, setProduct] = useState<Product | undefined>();
  const { id } = useParams<Params>() as Params;
  const [mobile, setMobile] = useState<boolean>(false);

  const idNumber: number = +id;

  useEffect(() => {
    getProduct(idNumber).then((data) => {
      setProduct(data);
    });
  }, []);

  if (product == undefined) {
    return (
      <>
        <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
        <div className="w-screen h-[50vh] text-5xl justify-center flex items-center">
          No such product!
        </div>

        <Footer />
      </>
    );
  } else {
    return (
      <>
        <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
        <ProductView product={product} />
        <Banner />

        <Footer />
      </>
    );
  }
};

export default ProductPage;
