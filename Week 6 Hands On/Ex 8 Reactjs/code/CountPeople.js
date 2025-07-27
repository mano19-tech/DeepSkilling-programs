import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState(prevState => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState(prevState => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '50px' }}>
        <h2>People Counter</h2>
        <div style={{ 
          display: 'flex', 
          justifyContent: 'center', 
          gap: '20px',
          margin: '20px 0'
        }}>
          <button 
            onClick={this.updateEntry}
            style={{
              padding: '10px 20px',
              backgroundColor: '#4CAF50',
              color: 'white',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer'
            }}
          >
            Login
          </button>
          <button 
            onClick={this.updateExit}
            style={{
              padding: '10px 20px',
              backgroundColor: '#f44336',
              color: 'white',
              border: 'none',
              borderRadius: '5px',
              cursor: 'pointer'
            }}
          >
            Exit
          </button>
        </div>
        <div style={{ 
          display: 'flex', 
          justifyContent: 'center', 
          gap: '50px',
          marginTop: '30px'
        }}>
          <div>
            <h3>Entered:</h3>
            <p style={{ fontSize: '24px', fontWeight: 'bold' }}>{this.state.entryCount}</p>
          </div>
          <div>
            <h3>Exited:</h3>
            <p style={{ fontSize: '24px', fontWeight: 'bold' }}>{this.state.exitCount}</p>
          </div>
        </div>
      </div>
    );
  }
}

export default CountPeople;
