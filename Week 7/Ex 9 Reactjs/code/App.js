import React, { useState } from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';
import './App.css';

function App() {
    const [flag, setFlag] = useState(true);

    return (
        <div className="App">
            <h1>Cricket Players App</h1>
            <button 
                onClick={() => setFlag(!flag)}
                className="toggle-btn"
            >
                {flag ? "Show Indian Players" : "Show All Players"}
            </button>
            
            {flag ? <ListofPlayers /> : <IndianPlayers />}
        </div>
    );
}

export default App;