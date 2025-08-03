import React, { useState } from 'react';
import './App.css';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div className="app">
      <header>
        <h1>Flight Ticket Booking</h1>
        {isLoggedIn ? (
          <button onClick={handleLogout}>Logout</button>
        ) : (
          <button onClick={handleLogin}>Login</button>
        )}
      </header>
      
      <main>
        <FlightDetails />
        {isLoggedIn && <TicketBooking />}
      </main>
    </div>
  );
}

function FlightDetails() {
  const flights = [
    { id: 1, flightNumber: 'AA123', departure: '10:00 AM', arrival: '12:30 PM', price: '$199' },
    { id: 2, flightNumber: 'BA456', departure: '02:00 PM', arrival: '04:45 PM', price: '$249' },
    { id: 3, flightNumber: 'DL789', departure: '06:00 PM', arrival: '08:15 PM', price: '$179' },
  ];

  return (
    <div className="flight-details">
      <h2>Available Flights</h2>
      <table>
        <thead>
          <tr>
            <th>Flight Number</th>
            <th>Departure</th>
            <th>Arrival</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {flights.map(flight => (
            <tr key={flight.id}>
              <td>{flight.flightNumber}</td>
              <td>{flight.departure}</td>
              <td>{flight.arrival}</td>
              <td>{flight.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

function TicketBooking() {
  const [selectedFlight, setSelectedFlight] = useState('');
  const [passengerName, setPassengerName] = useState('');
  const [bookingSuccess, setBookingSuccess] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    // In a real app, you would send this data to a server
    console.log(`Booking flight ${selectedFlight} for ${passengerName}`);
    setBookingSuccess(true);
    setSelectedFlight('');
    setPassengerName('');
  };

  if (bookingSuccess) {
    return (
      <div className="booking-success">
        <h3>Booking Confirmed!</h3>
        <p>Your ticket has been successfully booked.</p>
        <button onClick={() => setBookingSuccess(false)}>Book Another</button>
      </div>
    );
  }

  return (
    <div className="ticket-booking">
      <h2>Book Your Ticket</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label htmlFor="flight">Select Flight:</label>
          <select 
            id="flight" 
            value={selectedFlight}
            onChange={(e) => setSelectedFlight(e.target.value)}
            required
          >
            <option value="">-- Select a flight --</option>
            <option value="AA123">AA123 (10:00 AM - $199)</option>
            <option value="BA456">BA456 (02:00 PM - $249)</option>
            <option value="DL789">DL789 (06:00 PM - $179)</option>
          </select>
        </div>
        <div>
          <label htmlFor="name">Passenger Name:</label>
          <input
            id="name"
            type="text"
            value={passengerName}
            onChange={(e) => setPassengerName(e.target.value)}
            required
          />
        </div>
        <button type="submit">Book Now</button>
      </form>
    </div>
  );
}

export default App;