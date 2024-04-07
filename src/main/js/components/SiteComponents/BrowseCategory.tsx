const BrowseCategory = () => {
  return (
    <div className="w-[100%] md:h-[150vh] lg:h-[75vh] relative flex p-6  flex-col gap-2  ">
      <h1 className="text-4xl md:text-4xl text-center p-2">Select Category:</h1>
      <div className="w-[70%] h-[90%]  self-center mx-auto left-0 right-0 flex flex-col lg:flex-row gap-4 justify-around border-black/25 border-b-[1px] border-solid p-4">
        <div className="h-[33%]  md:-[70%] lg:h-[90%] w-[100%] lg:w-[33%] text-3xl flex-col flex text-center rounded-lg ">
          <img
            className="h-[100%] w-[100%] lg:h-[90%]  object-contain rounded-lg"
            src="./src/main/static/public/desk (4).jpg"
          />
          Chairs
        </div>

        <div className="h-[33%] md:-[70%]  lg:h-[90%] w-[100%] lg:w-[33%] text-3xl flex-col flex text-center rounded-lg ">
          <img
            className="h-[100%] w-[100%] lg:h-[90%]  object-contain rounded-lg"
            src="./src/main/static/public/Desk (3).jpg"
          />
          Desks
        </div>

        <div className="h-[33%] md:-[70%]  lg:h-[90%] w-[100%] lg:w-[33%] text-3xl flex-col flex text-center rounded-lg ">
          <img
            className="h-[100%] w-[100%] lg:h-[90%]  object-contain rounded-lg"
            src="./src/main/static/public/Lamp.jpg"
          />
          Accessories
        </div>
      </div>
    </div>
  );
};

export default BrowseCategory;
