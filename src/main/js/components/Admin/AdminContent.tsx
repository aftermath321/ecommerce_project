import React from 'react'

const AdminContent = () => {
  return (
    <div className="w-[100%] h-[100vh] ">
      <div className="w-[80%] h-[100%] bg-gray-400 left-0 right-0 mx-auto">
        <ul className="left-0 right-0 mx-auto bg-gray-200 h-[100%] w-[100%] m-2 p-2 text-4xl flex flex-col align-center justify-center text-center gap-y-4">
          <li className='hover:text-yellow-400 duration-300'>Add item</li>
          <li className='hover:text-yellow-400 duration-300'>Change text</li>
          <li className='hover:text-yellow-400 duration-300'>Change picture</li>
          <li className='hover:text-yellow-400 duration-300'>Manage users</li>
          <li></li>
          <li></li>
        </ul>
      </div>
    </div>
  );
}

export default AdminContent;