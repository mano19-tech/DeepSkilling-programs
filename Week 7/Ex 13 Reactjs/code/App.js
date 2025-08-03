
import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import './App.css';

function App() {
  const [showContent, setShowContent] = useState({
    books: true,
    blog: true,
    course: true
  });

  const bookData = {
    title: 'React Essentials',
    author: 'John Doe',
    year: 2023
  };

  const blogData = {
    title: 'Learning React',
    content: 'React is a JavaScript library for building user interfaces...',
    date: '2023-10-15'
  };

  const courseData = {
    name: 'React Fundamentals',
    instructor: 'Jane Smith',
    duration: 4,
    isAdvanced: false
  };

  return (
    <div className="App">
      <h1>Blogger App</h1>
      
      <div className="controls">
        <button onClick={() => setShowContent({...showContent, books: !showContent.books})}>
          Toggle Books
        </button>
        <button onClick={() => setShowContent({...showContent, blog: !showContent.blog})}>
          Toggle Blog
        </button>
        <button onClick={() => setShowContent({...showContent, course: !showContent.course})}>
          Toggle Course
        </button>
      </div>

      {showContent.books && <BookDetails book={bookData} />}
      {showContent.blog && <BlogDetails blog={blogData} isPublished={true} />}
      {showContent.course && <CourseDetails course={courseData} />}
    </div>
  );
}

export default App;