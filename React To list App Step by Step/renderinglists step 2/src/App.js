import "./styles.css";

import Count from "./Count/Count";
import Header from "./Header/Header";
import SubHeader from "./Header/SubHeader";

export default function App() {
  const tasks = [];

  return (
    <div className="App">
      <Header />
      <SubHeader />

      <hr />

      {tasks.length === 0 ? (
        <p>Nothing to do buddy. Sleep!!</p>
      ) : (
        <ul>
          {tasks.map((task, index) => (
            <li key={index}>{task}</li>
          ))}
        </ul>
      )}

      <hr />
    </div>
  );
}
