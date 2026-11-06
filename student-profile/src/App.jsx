import React from "react";
import StudentProfile from "./StudentProfile";
import Counter from "./Counter";

function App() {
  return (
    <div>
      <StudentProfile
        name="Rakhi"
        email="rakhi@gmail.com"
        course="BCA"
        image="https://via.placeholder.com/150"
      />

      <Counter />
    </div>
  );
}

export default App;