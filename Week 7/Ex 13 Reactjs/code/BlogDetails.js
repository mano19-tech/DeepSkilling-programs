
import React from 'react';

function BlogDetails({ blog, isPublished }) {
  return (
    <div>
      <h2>Blog Details</h2>
      {isPublished ? (
        <div>
          <p>Title: {blog.title}</p>
          <p>Content: {blog.content}</p>
          <p>Published on: {blog.date}</p>
        </div>
      ) : (
        <p>This blog is not published yet</p>
      )}
    </div>
  );
}

export default BlogDetails;