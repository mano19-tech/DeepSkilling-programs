import React from 'react';
import './App.css';

function App() {
  // Office space data
  const offices = [
    {
      id: 1,
      name: "Tech Hub Plaza",
      rent: 55000,
      address: "123 Tech Street, Innovation City",
      image: "https://images.unsplash.com/photo-1497366811353-6870744d04b2?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    },
    {
      id: 2,
      name: "Corporate Towers",
      rent: 75000,
      address: "456 Business Avenue, Downtown",
      image: "https://images.unsplash.com/photo-1524758631624-e2822e304c36?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    },
    {
      id: 3,
      name: "Startup Lofts",
      rent: 45000,
      address: "789 Creative Lane, Arts District",
      image: "https://images.unsplash.com/photo-1554469384-e58fac16e23a?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    },
    {
      id: 4,
      name: "Executive Suites",
      rent: 85000,
      address: "321 Premium Road, Uptown",
      image: "https://images.unsplash.com/photo-1502672260266-1c1ef2d93688?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
    }
  ];

  return (
    <div className="App">
      {/* Page heading */}
      <h1>Office Space Rental Listings</h1>
      
      <div className="office-list">
        {/* Loop through office data using map() */}
        {offices.map(office => (
          <div key={office.id} className="office-card">
            {/* Office image with attribute */}
            <img src={office.image} alt={office.name} className="office-image" />
            
            {/* Office details */}
            <div className="office-details">
              <h2>{office.name}</h2>
              <p><strong>Address:</strong> {office.address}</p>
              
              {/* Conditional styling for rent price */}
              <p>
                <strong>Rent:</strong> 
                <span style={{ 
                  color: office.rent < 60000 ? 'red' : 'green',
                  fontWeight: 'bold',
                  marginLeft: '5px'
                }}>
                  ₹{office.rent.toLocaleString()}/month
                </span>
              </p>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;