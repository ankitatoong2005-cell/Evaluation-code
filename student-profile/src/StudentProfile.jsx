import React from "react";
import "./StudentProfile.css";

function StudentProfile(props) {
  return (
    <div className="profile">
      <img src={props.image} alt="Student" />

      <h2>{props.name}</h2>
      <p>Email: {props.email}</p>
      <p>Course: {props.course}</p>
    </div>
  );
}

export default StudentProfile;