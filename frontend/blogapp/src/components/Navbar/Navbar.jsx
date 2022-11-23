import React from "react";
import { useLocation } from "react-router-dom";
import { Container, PlusBtn, Text } from "./NavbarStyles";

const Navbar = () => {
  const location = useLocation();

  return (
    <>
      <Container>
        <Text>React and Spring Boot Example</Text>
        {location.pathname === "/" && <PlusBtn>+</PlusBtn>}
      </Container>
    </>
  );
};

export default Navbar;
