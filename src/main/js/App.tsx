import { useEffect, useState } from "react";
import "./styles/App.css";
import "./styles/index.css";
import { getUsers, postUser } from "./api/usersAPI";
import { User } from "../types/Users";
import { Routes, Route } from "react-router-dom";
import UsersPage from "./pages/UsersPage";
import MainPage from "./pages/MainPage";
import ProductPage from "./pages/ProductPage";
import ProductView from "./components/ProductView";
import AddProduct from "./components/AddProduct";
import Header from "./components/Header";

const user: User = {
  id: null,
  firstName: "Ola",
  lastName: "Jakas",
  email: "email@email.com",
  password: "pass",
};
function App() {
  const [users, setUsers] = useState<User[]>([]);
  const [mobile, setMobile] = useState<boolean>(false);

  useEffect(() => {
    getUsers().then((data) => {
      setUsers(data);
    });
  }, []);

  return (
    <div>
      
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/product/:id" element={<ProductPage />} />
        <Route path="/users" element={<UsersPage />} />
      </Routes>
    </div>
  );
}

export default App;
