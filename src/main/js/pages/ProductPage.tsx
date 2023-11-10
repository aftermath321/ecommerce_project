import React, { useState, useEffect } from "react";
import { Product } from "../../types/Product";
import { getProduct } from "../api/productsAPI";
import { useParams } from "react-router-dom";
import Header from "../components/Header";
import ProductView from "../components/ProductView";
import Footer from "../components/Footer";

export type Params = {
  id: string;
};

const ProductPage = () => {
  const [product, setProduct] = useState<Product>();
  const { id } = useParams<Params>() as Params;
  const [mobile, setMobile] = useState<boolean>(false);


  const idNumber: number = +id;

  useEffect(() => {
    getProduct(idNumber).then((data) => {
      setProduct(data);
    });
  }, []);

  return (
    <>
      <Header mobileMenu={mobile} mobileMenuSetter={setMobile} dark={false} />
      <ProductView product={product} />
      
      <Footer />
    </>
  );
};


export default ProductPage;
