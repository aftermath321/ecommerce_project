import React, { useState } from "react";
import HeaderDark from "../components/HeadAndFoot/HeaderDark";
import Footer from "../components/HeadAndFoot/Footer";
import SearchResult from "../components/Product/SearchResult";
import HeaderLight from "../components/HeadAndFoot/HeaderLight";

const SearchPage = () => {

    const [mobile, setMobile] = useState<boolean>(false);

    const queryParameters = new URLSearchParams(window.location.search);

    const phrase = queryParameters.get("phrase");
    
    const checkNull = () => {
        if (phrase === null){
            return <>No such product!</>
        } else {
            return <SearchResult phrase={phrase} />;
        }
    }
    
    return(
    <>
        <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
        {checkNull()}
        <Footer />
    </>)
}

export default SearchPage;
