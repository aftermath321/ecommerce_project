import React, { useEffect } from 'react'
import ReviewItem from './ReviewItem'

type Reviewed = {
    title: string,
    author: string,
    rating: number,
    date: string,
    review: string,
    content: string;
}

const review1: Reviewed = {
  title: "Comfortable Office Chair",
  author: "John Smith",
  rating: 0,
  date: "2024-03-04",
  review: "Great chair, very comfortable for long hours of work.",
  content:
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
};

const review2: Reviewed = {
  title: "Sturdy Desk",
  author: "Alice Johnson",
  rating: 3,
  date: "2024-03-02",
  review: "Solid desk, easy to assemble.",
  content:
    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
};
const review3: Reviewed = {
  title: "Modern Ergonomic Chair",
  author: "Emily Brown",
  rating: 2,
  date: "2024-03-01",
  review: "Love the design and comfort of this chair!",
  content:
    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
};

const review4: Reviewed = {
  title: "Adjustable Standing Desk",
  author: "David Miller",
  rating: 5,
  date: "2024-02-28",
  review: "Excellent desk, helps with posture and productivity.",
  content:
    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
};


const ReviewList = (props: {countFunction: Function}) => {

    useEffect(()=>{

    }, [])

  return (
    <div className="w-[100%] h-[100%]flex flex-col gap-4 mx-auto left-0 right-0">
      <ul className="mx-auto left-0 right-0 flex flex-col justify-center gap-4">
        <ReviewItem review={review1} />
        <ReviewItem review={review2} />
        <ReviewItem review={review3} />
        <ReviewItem review={review4} />
      </ul>
    </div>
  );
}

export default ReviewList