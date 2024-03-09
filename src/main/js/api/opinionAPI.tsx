import { Opinion } from "../../types/Opinion";

export async function getOpinions() {
  return fetch("http://localhost:8080/opinion/all-opinions").then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}
export async function getOpinion(id: Number) {
  return fetch(`http://localhost:8080/opinion/${id}`).then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}
export async function getOpinionsOnProduct(id: Number) {
  return fetch(`http://localhost:8080/opinion/product/${id}`).then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}

export async function postUser(opinion: Opinion) {
  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(opinion),
  };

  fetch("http://localhost:8080/opinion/save", requestOptions).then(
    (response) => {
      if (!response.ok) {
        throw new Error(response.statusText);
      }
      return response.json();
    }
  );
}
