import { UserForm } from "../../types/UserForm";

interface JSONResponse {
  text: string;
}

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

  await fetch("http://localhost:8080/user/save", requestOptions).then(
    (response) => {
      if (!response.ok) {
        throw new Error(response.statusText);
      }
      return response.json();
    }
  );
}

export async function login(user: UserForm): Promise<JSONResponse> {
  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(user),
  };

  try {
    const response = await fetch(
      "http://localhost:8080/user/login",
      requestOptions
    );

    if (!response.ok) {
      throw new Error(response.statusText);
    }

    const tempResponse: JSONResponse = await response.json();
    return tempResponse;
  } catch (error) {
    console.error("Error logging in:", error);
    throw new Error("Failed to log in.");
  }
}
