import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent default form submission behavior
    const conversionRate = 0.011; // Approximate rate (check current rate)
    setEuros((rupees * conversionRate).toFixed(2));
  };

  return (
    <div>
      <h2>Currency Converter</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Indian Rupees:
          <input 
            type="number" 
            value={rupees} 
            onChange={(e) => setRupees(e.target.value)} 
          />
        </label>
        <button type="submit">Convert</button>
      </form>
      {euros && <p>{rupees} INR = {euros} EUR</p>}
    </div>
  );
}

export default CurrencyConverter;