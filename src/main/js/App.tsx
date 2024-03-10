import "./styles/App.css";
import "./styles/index.css";
import { Routes, Route } from "react-router-dom";
import UsersPage from "./pages/UsersPage";
import MainPage from "./pages/MainPage";
import ProductPage from "./pages/ProductPage";
import SignUpPage from "./pages/SignUpPage";
import AdminPage from "./pages/AdminPage";
import AddProductPage from "./pages/AddProductPage";
import AboutPage from "./pages/AboutPage";

function App() {
  return (
    <div>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/product/:id" element={<ProductPage />} />
        <Route path="/users" element={<UsersPage />} />
        <Route path="/sign-up" element={<SignUpPage />} />
        <Route path="/admin" element={<AdminPage />} />
        <Route path="/admin/addproduct" element={<AddProductPage />} />
        <Route path="/about-us" element={<AboutPage />} />
      </Routes>
    </div>
  );
}

export default App;
