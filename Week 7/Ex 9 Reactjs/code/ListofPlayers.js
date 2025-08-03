import React from 'react';

const ListofPlayers = () => {
    // Array of 11 players with names and scores
    const players = [
        { name: "Virat Kohli", score: 120 },
        { name: "Rohit Sharma", score: 65 },
        { name: "KL Rahul", score: 89 },
        { name: "Rishabh Pant", score: 45 },
        { name: "Hardik Pandya", score: 72 },
        { name: "Jasprit Bumrah", score: 10 },
        { name: "Ravindra Jadeja", score: 55 },
        { name: "Mohammed Shami", score: 15 },
        { name: "Shikhar Dhawan", score: 68 },
        { name: "Yuzvendra Chahal", score: 20 },
        { name: "Bhuvneshwar Kumar", score: 12 }
    ];

    // Filter players with scores below 70 using arrow function
    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div className="players-container">
            <h2>All Players</h2>
            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - Score: {player.score}
                    </li>
                ))}
            </ul>

            <h2>Players with Scores Below 70</h2>
            <ul>
                {lowScorePlayers.map((player, index) => (
                    <li key={index}>
                        {player.name} - Score: {player.score}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ListofPlayers;