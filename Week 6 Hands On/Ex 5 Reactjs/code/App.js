import React from 'react';
import CohortDetails from './Components/CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'Cohort 2023A',
      startDate: '2023-01-15',
      endDate: '2023-07-15',
      participants: 25,
      status: 'completed'
    },
    {
      name: 'Cohort 2023B',
      startDate: '2023-08-01',
      endDate: '2024-01-31',
      participants: 30,
      status: 'ongoing'
    }
  ];

  return (
    <div>
      <h1>Cohort Dashboard</h1>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;