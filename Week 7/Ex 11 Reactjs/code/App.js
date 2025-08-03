import logo from './logo.svg';
import './App.css';
import Counter from './Counter';
import WelcomeButton from './WelcomeButton';
import SyntheticEvent from './SyntheticEvent';
import CurrencyConverter from './CurrencyConverter';


function App() {
  return (
    <div className="App">
         <h1>React Event Handling Examples</h1>
      <Counter />
      <WelcomeButton />
      <SyntheticEvent />
      <CurrencyConverter />
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
      </header>
    </div>
  );
}

export default App;
