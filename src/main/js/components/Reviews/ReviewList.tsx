import ReviewItem from './ReviewItem'
import { Opinion } from '../../../types/Opinion';

const ReviewList = (props: {reviews: Opinion[]}) => {


  return (
    <div className="w-[100%] h-[100%]flex flex-col gap-4 mx-auto left-0 right-0">
      <ul className="mx-auto left-0 right-0 flex flex-col justify-center gap-4">
        {props.reviews.map((item, index)=>{
          return <ReviewItem review={item} key={index} />;
        })}
      </ul>
    </div>
  );
}

export default ReviewList