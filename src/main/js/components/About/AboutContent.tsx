const AboutContent = () => {
  return (
    <div className="bg-white  w-[100%]">
      <div className="flex flex-row  h-[100%] justify-center gap-[50px] ">
        <div className="h-[100%] w-[70vw]  justify-center text-center flex flex-col py-4">
          <div className=" md:w-[500px] h-[70vh] lg:h-[80%] self-center gap-4 ">
            <h1 className="text-5xl my-4">About us</h1>
            <p className="text-xl py-4">
              Welcome to HomeOffice, your destination for quality office
              furniture. We specialize in providing businesses of all sizes with
              stylish and functional furnishings to create inspiring workspaces.
              <br />
              <br />
              Our diverse collection includes ergonomic chairs, sleek desks, and
              versatile storage solutions designed to enhance productivity and
              comfort. <br />
              <br />
              With a focus on quality and customer satisfaction, we offer expert
              advice and personalized assistance to help you find the perfect
              pieces for your office. Thank you for choosing HomeOffice. Let's
              create a workspace you'll love.
            </p>
          </div>
        </div>

        <div className="h-auto w-[70vw] hidden lg:flex flex-row right-0">
          <div className="h-[100%] w-[20vw] bg-gradient-to-l to-white from-transparent absolute"></div>
          <img
            src="./src/main/static/public/about2.jpg"
            className="h-auto w-[90vw] "
          ></img>
        </div>
      </div>
    </div>
  );
};

export default AboutContent;
