import { useState } from "react";
import Footer from "../components/HeadAndFoot/Footer";
import SearchResult from "../components/Product/SearchResult";
import HeaderLight from "../components/HeadAndFoot/HeaderLight";


const SearchPage = () => {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <SearchResult />;
      <Footer />
    </>
  );
};

export default SearchPage;
