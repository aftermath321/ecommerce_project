import React from "react";
import RatingSystem from "./RatingSystem";

type Reviewed = {
  title: string;
  author: string;
  rating: number;
  date: string;
  content: string;
};

const ReviewItem = (props: {review: Reviewed}) => {
  return (
    <li className="w-[80%]  border-2 self-center p-2">
      <div className="flex flex-row justify-between">
        <h1 className="text-2xl p-2">{props.review.title}</h1>
        <span className="scale-125 p-4">
          <RatingSystem stars={props.review.rating} />
        </span>
      </div>
      <h2 className="text-lg p-2">{props.review.author}</h2>
      <p className="m-2">{props.review.content}</p>
      <h3 className="flex justify-end">{props.review.date}</h3>
    </li>
  );
};

export default ReviewItem;
