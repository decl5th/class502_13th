import Todos from "./components/Todos";

const App = () => {
  return <Todos onClick={() => console.log('클릭!')} />;
};

export default App;