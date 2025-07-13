import React, { useState } from 'react';
import axios from 'axios';

function App() {
  const [token, setToken] = useState('');
  const [countries, setCountries] = useState([]);
  const [username, setUsername] = useState('user');
  const [password, setPassword] = useState('pwd');

  const authenticate = () => {
    const authHeader = 'Basic ' + btoa(`${username}:${password}`);
    axios.get('http://localhost:8090/authenticate', {
      headers: { Authorization: authHeader }
    })
    .then(response => {
      setToken(response.data.token);
    })
    .catch(error => {
      alert("Authentication Failed");
    });
  };

  const fetchCountries = () => {
    axios.get('http://localhost:8090/countries', {
      headers: { Authorization: `Bearer ${token}` }
    })
    .then(response => {
      setCountries(response.data);
    })
    .catch(error => {
      alert("Unauthorized or Invalid Token");
    });
  };

  return (
    <div style={{ padding: 20 }}>
      <h2>Spring Learn - Country Viewer</h2>
      <div>
        <label>Username: </label>
        <input value={username} onChange={(e) => setUsername(e.target.value)} />
        <label>Password: </label>
        <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />
        <button onClick={authenticate}>Get Token</button>
      </div>
      {token && (
        <div style={{ marginTop: 20 }}>
          <p><strong>Token:</strong> {token}</p>
          <button onClick={fetchCountries}>Fetch Countries</button>
        </div>
      )}
      <ul>
        {countries.map((c, idx) => <li key={idx}>{c.code} - {c.name}</li>)}
      </ul>
    </div>
  );
}

export default App;
