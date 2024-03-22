import { Product } from "../../types/Product";

export async function getProducts() {
  return fetch("http://localhost:8080/product/all-products").then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}
export async function getProduct(id: Number) {
  return fetch(`http://localhost:8080/product/${id}`).then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}

export async function postProduct(product: Product) {
  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(product),
  };

  fetch("http://localhost:8080/product/save", requestOptions).then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}

export async function searchProductByName(phrase: string | null){
    return fetch(`http:///localhost:8080/product/search?phrase=${phrase}`).then((response) => {
        if (!response.ok) {
          throw new Error(response.statusText);
        }
        return response.json();
      }
    );
  
}
