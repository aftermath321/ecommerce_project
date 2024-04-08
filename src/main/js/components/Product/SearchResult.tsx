import { useEffect, useState } from "react";
import { Product } from "../../../types/Product";
import { searchProductByName } from "../../api/productsAPI";
import { Link, useLocation, useSearchParams } from "react-router-dom";
import ProductCard from "./ProductCard";

const SearchResult = () => {
  const [isLoading, setIsLoading] = useState<boolean>(true);
  const [productList, setProductList] = useState<Product[] | null>([]);
  const [URLSearchParams, SetURLSearchParams] = useSearchParams();
  const { search } = useLocation();

  useEffect(() => {
    SetURLSearchParams(search);
    URLSearchParams.forEach((value: string) => {
      searchProductByName(value).then((data) => {
        setProductList(data as Product[]);
      });
      setIsLoading(false);
    });
  }, [URLSearchParams]);

  const renderGrid = (): JSX.Element => {
    if (isLoading) {
      return <>Loading</>;
    } else if (productList?.length == 0) {
      return (
        <div className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32">
          <div className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
            <h1 className="text-3xl self-center">No such products.</h1>
          </div>
        </div>
      );
    } else {
      return (
        <div className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32">
          <ul className="w-[100%] h-[90%] flex justify-center flex-wrap  text-center p-4  gap-y-8 gap-x-32  bg-white">
            {productList?.map((item) => {
              return (
                <li key={item.id}>
                  <Link to={"/product/" + item.id}>
                    <ProductCard product={item} />
                  </Link>
                </li>
              );
            })}
          </ul>
        </div>
      );
    }
  };

  return <div className="w-[100%] min-h-[80vh]">{renderGrid()}</div>;
};

export default SearchResult;
