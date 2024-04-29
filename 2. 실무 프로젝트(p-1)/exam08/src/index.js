import React from "react";
import ReactDOM from "react-dom/client";
import { Provider } from "react-redux";
import { legacy_createStore as createStore } from "redux";
import rootReducer from "./modules";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import { composeWithDevTools } from "redux-devtools-extension"; // 크롬에서 상태값과 상태변경함수의 상태 확인이 가능해짐

const store = createStore(rootReducer, composeWithDevTools()); 

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode store={store}>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
