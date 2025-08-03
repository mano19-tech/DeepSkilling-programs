
import React from 'react';

function CourseDetails({ course }) {
  return (
    <div>
      <h2>Course Details</h2>
      {course && (
        <div>
          <p>Name: {course.name}</p>
          <p>Instructor: {course.instructor}</p>
          <p>Duration: {course.duration} weeks</p>
          {course.isAdvanced && <p>Advanced Level</p>}
        </div>
      )}
    </div>
  );
}

export default CourseDetails;