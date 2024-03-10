import { useState } from 'react'
import Footer from '../components/HeadAndFoot/Footer';
import HeaderLight from '../components/HeadAndFoot/HeaderLight';
import AboutContent from '../components/About/AboutContent';

const AboutPage = () => {

      const [mobile, setMobile] = useState<boolean>(false);

      return (
        <>
          <HeaderLight mobileMenu={mobile} mobileMenuSetter={setMobile} />
          <AboutContent />
          <Footer />
        </>
      );

}

export default AboutPage