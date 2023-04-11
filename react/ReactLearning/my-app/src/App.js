import Login from "./components/Login";
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Dashboard from "./Dashboard";
function App() {
  return (
    <div>
      <div >
        <BrowserRouter>


          <Routes>
            <Route index element={<Login />} />
            <Route path="/Dashboard" element={<Dashboard/>} />

          </Routes>

        </BrowserRouter>

      </div>
    </div>
  );
}

export default App;
