import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import DetailsBlogContent from "./components/DetailBlogContent/DetailsBlogContent";
import DetailsPage from "./pages/DetailsPage";
import Home from "./pages/Home";

const App = () => {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/details/:id" element={<DetailsPage />} />
      </Routes>
    </Router>
  );
};

export default App;
