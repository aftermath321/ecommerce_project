import React from "react";
import { Link } from "react-router-dom";

const AdminContent = () => {
  return (
    <div className="w-[100%] h-[100vh] ">
      <div className="w-[80%] h-[100%] bg-white left-0 right-0 mx-auto">
        <ul className="left-0 right-0 mx-auto bg-white h-[100%] w-[100%] m-2 p-2 text-4xl flex flex-col align-center justify-center text-center gap-y-4">
          <Link to={"/admin/addproduct"}>
            <li className="hover:text-yellow-400 duration-300">Add item</li>
          </Link>
          <li className="hover:text-yellow-400 duration-300">Change text</li>
          <li className="hover:text-yellow-400 duration-300">Change picture</li>
          <li className="hover:text-yellow-400 duration-300">Manage users</li>
          <li></li>
          <li></li>
        </ul>
      </div>
    </div>
  );
};

export default AdminContent;
