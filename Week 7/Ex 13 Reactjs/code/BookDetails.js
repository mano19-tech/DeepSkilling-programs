
import React from 'react';

function BookDetails({ book }) {
  if (!book) {
    return <div>No book selected</div>;
  } else {
    return (
      <div>
        <h2>Book Details</h2>
        <p>Title: {book.title}</p>
        <p>Author: {book.author}</p>
        <p>Year: {book.year}</p>
      </div>
    );
  }
}

export default BookDetails;