import { UserForm } from "../../types/UserForm";

export async function getUsers() {
  return fetch("http://localhost:8080/user/all-users").then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}
export async function getUser(id: Number) {
  return fetch(`http://localhost:8080/user/${id}`).then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}

export async function postUser(user: UserForm) {
  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(user),
  };

  fetch("http://localhost:8080/user/save", requestOptions).then((response) => {
    if (!response.ok) {
      throw new Error(response.statusText);
    }
    return response.json();
  });
}

export async function login(user: UserForm): Promise<any> {
  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(user),
  };

  fetch("http://localhost:8080/user/login", requestOptions).then((response) => {
    if (!response.ok) {
      return new Error(response.statusText);
    } else {
      // console.log(response.json());
      return response.json();
    }
  });
}
