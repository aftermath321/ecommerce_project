import RatingSystem from "./RatingSystem";
import { Opinion } from "../../../types/Opinion";

const ReviewItem = (props: { review: Opinion }) => {
  return (
    <li className="w-[80%]  border-2 self-center p-2" >
      <div className="flex flex-row justify-between">
        <h1 className="text-2xl p-2">{props.review.title}</h1>
        <span className="scale-125 p-4">
          <RatingSystem stars={props.review.rating} />
        </span>
      </div>
      <h2 className="text-lg p-2">{props.review.author}</h2>
      <p className="m-2">{props.review.body}</p>
      <h3 className="flex justify-end">
        {props.review.posted.toLocaleString("en-GB", { timeZone: "UTC" })}
      </h3>
    </li>
  );
};

export default ReviewItem;
