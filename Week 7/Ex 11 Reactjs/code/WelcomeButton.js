import React from 'react';

function WelcomeButton() {
  const sayWelcome = (message) => {
    alert(message);
  };

  return (
    <div>
      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>
    </div>
  );
}

export default WelcomeButton;
