import React, { useState } from 'react';

function ComplaintRegister() {
  const [formData, setFormData] = useState({
    employeeName: '',
    complaint: '',
  });
  const [referenceNumber, setReferenceNumber] = useState(null);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Generate a random reference number
    const refNum = Math.floor(Math.random() * 1000000);
    setReferenceNumber(refNum);
    
    alert(`Complaint submitted successfully!\nReference Number: ${refNum}`);
    
    // Reset form
    setFormData({
      employeeName: '',
      complaint: '',
    });
  };

  return (
    <div style={{ padding: '20px', maxWidth: '500px', margin: '0 auto' }}>
      <h2>Complaint Registration</h2>
      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: '15px' }}>
          <label htmlFor="employeeName" style={{ display: 'block', marginBottom: '5px' }}>
            Employee Name:
          </label>
          <input
            type="text"
            id="employeeName"
            name="employeeName"
            value={formData.employeeName}
            onChange={handleChange}
            required
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
        </div>
        
        <div style={{ marginBottom: '15px' }}>
          <label htmlFor="complaint" style={{ display: 'block', marginBottom: '5px' }}>
            Complaint:
          </label>
          <textarea
            id="complaint"
            name="complaint"
            value={formData.complaint}
            onChange={handleChange}
            required
            rows="5"
            style={{ width: '100%', padding: '8px', boxSizing: 'border-box' }}
          />
        </div>
        
        <button 
          type="submit" 
          style={{
            padding: '10px 15px',
            backgroundColor: '#4CAF50',
            color: 'white',
            border: 'none',
            borderRadius: '4px',
            cursor: 'pointer'
          }}
        >
          Submit Complaint
        </button>
      </form>
      
      {referenceNumber && (
        <div style={{ marginTop: '20px', padding: '10px', backgroundColor: '#f8f9fa' }}>
          <p>Reference Number for follow-up: <strong>{referenceNumber}</strong></p>
        </div>
      )}
    </div>
  );
}

export default ComplaintRegister;