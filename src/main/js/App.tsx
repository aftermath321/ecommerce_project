import { useEffect, useState } from "react";
import "./styles/App.css";
import "./styles/index.css";
import { getUsers, postUser } from "./api/usersAPI";
import { User } from "../types/Users";

const user: User = {
  id: null,
  firstName: "Ola",
  lastName: "Jakas",
  email: "email@email.com",
  password: "pass",
};
function App() {
  const [users, setUsers] = useState<User[]>([]);

  useEffect(() => {
    getUsers().then((data) => {
      setUsers(data);
    });
  }, []);


  return (
    <>
      <ul>
        {users.map((user) => {
          return <li>{user.firstName}</li>;
        })}
      </ul>
    </>
  );
}

export default App;
