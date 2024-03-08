import { AiOutlineStar, AiFillStar } from "react-icons/ai";
const RatingSystem = (props: { stars: number | undefined }): JSX.Element => {
  if (typeof props.stars == "undefined") {
    return (
      <div className="flex flex-row text-gray-700">
        <AiOutlineStar />
        <AiOutlineStar />
        <AiOutlineStar />
        <AiOutlineStar />
        <AiOutlineStar />
      </div>
    );
  } else {
    switch (props.stars) {
      case 0:
        return (
          <div className="flex flex-row text-gray-700">
            <AiOutlineStar />
            <AiOutlineStar />
            <AiOutlineStar />
            <AiOutlineStar />
            <AiOutlineStar />
          </div>
        );

      case 1:
        return (
          <div className="flex flex-row text-gray-700">
            <AiFillStar />
            <AiOutlineStar />
            <AiOutlineStar />
            <AiOutlineStar />
            <AiOutlineStar />
          </div>
        );

      case 2:
        return (
          <div className="flex flex-row text-gray-700">
            <AiFillStar />
            <AiFillStar />
            <AiOutlineStar />
            <AiOutlineStar />
            <AiOutlineStar />
          </div>
        );

      case 3:
        return (
          <div className="flex flex-row text-gray-700">
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiOutlineStar />
            <AiOutlineStar />
          </div>
        );
      case 4:
        return (
          <div className="flex flex-row text-gray-700">
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiOutlineStar />
          </div>
        );
      case 5:
        return (
          <div className="flex flex-row text-gray-700">
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
            <AiFillStar />
          </div>
        );
    }
  }
  return <></>;
};

export default RatingSystem;
