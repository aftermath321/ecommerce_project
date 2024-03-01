import React, { useState } from "react";
import HeaderDark from "../components/HeadAndFoot/HeaderDark";
import HeaderLight from "../components/HeadAndFoot/HeaderLight";
import Footer from "../components/HeadAndFoot/Footer";
import AdminContent from "../components/Admin/AdminContent";

const AdminPage = () => {
  const [mobile, setMobile] = useState<boolean>(false);

  return (
    <>
      <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
      <AdminContent />
      <Footer />
    </>
  );
};

export default AdminPage;
