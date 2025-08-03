import React from 'react';
import EmployeeCard from './EmployeeCard';

function EmployeesList() {
  const employees = [
    { id: 1, name: 'Dharnan', position: 'Developer' },
    { id: 2, name: 'Vishva', position: 'Testing' }
  ];

  return (
    <div className="employee-list">
      {employees.map(employee => (
        <EmployeeCard key={employee.id} employee={employee} />
      ))}
    </div>
  );
}

export default EmployeesList;