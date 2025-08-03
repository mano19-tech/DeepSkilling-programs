import React, { Component } from 'react';

class GetUser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null,
      loading: true,
      error: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      if (!response.ok) {
        throw new Error('Network response was not ok');
      }
      const data = await response.json();
      this.setState({
        user: data.results[0],
        loading: false
      });
    } catch (error) {
      this.setState({
        error: error.message,
        loading: false
      });
    }
  }

  render() {
    const { user, loading, error } = this.state;

    if (loading) return <div>Loading...</div>;
    if (error) return <div>Error: {error}</div>;
    if (!user) return <div>No user data</div>;

    return (
      <div style={{ padding: '20px', textAlign: 'center' }}>
        <h2>User Details</h2>
        <img 
          src={user.picture.large} 
          alt={`${user.name.first} ${user.name.last}`}
          style={{ borderRadius: '50%', margin: '10px' }}
        />
        <p>
          <strong>Title:</strong> {user.name.title}
        </p>
        <p>
          <strong>First Name:</strong> {user.name.first}
        </p>
      </div>
    );
  }
}

export default GetUser;