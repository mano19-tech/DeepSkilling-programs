import React, { useState, useEffect } from 'react';
import GitClient from './GitClient';
import './App.css';

function App() {
  const [repos, setRepos] = useState([]);
  const gitClient = new GitClient();

  useEffect(() => {
    gitClient.getRepositories('techiesyed')
      .then(repositoryNames => setRepos(repositoryNames));
  }, []);

  return (
    <div className="App">
      <h1>GitHub Repositories</h1>
      <ul>
        {repos.map((repo, index) => (
          <li key={index}>{repo}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;