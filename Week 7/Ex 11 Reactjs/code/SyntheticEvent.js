import React from 'react';

function SyntheticEvent() {
  const handleClick = (e) => {
    // e is the SyntheticEvent
    console.log(e); // You can inspect the synthetic event in console
    alert("I was clicked");
  };

  return (
    <div>
      <button onClick={handleClick}>
        Click me (Synthetic Event)
      </button>
    </div>
  );
}

export default SyntheticEvent;
