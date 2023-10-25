import { useEffect, useState } from "react";

import "./App.css";
import { getUsers } from "./api/products";

function App() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    getUsers().then((data) => {
      console.log(data)
      setUsers(data[0]);
      
    });
  }, []);

  return (
    <>
      <ul>
        {users.map((user) => {
          return <li>{user}</li>;
        })}
      </ul>
    </>
  );
}

export default App;
