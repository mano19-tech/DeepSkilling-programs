import React from 'react';
import './Stylesheets/mystyle.css';
import CalculateScore from './Components/CalculateScore';

function App() {
    return (
        <div className="App">
           <centre>
            <CalculateScore 
           
                Name="vishva" 
                School="Annai High School" 
                Total={350} 
                goal={500}
                
            />
            </centre> 
        </div>
    );
}

export default App;