import { Routes, Route} from "react-router-dom";

// 쓰고 있는 페이지만 로딩하여 볼 수 있도록 loadable 사용
import loadable from '@loadable/component';
const Home = loadable(() => import('./pages/Home'));
const About = loadable(() => import('./pages/About'));
const BoardList = loadable(() => import('./pages/BoardList'));
const MainLayout = loadable(() => import('./layouts/MainLayout'));
const NotFound = loadable(() => import('./pages/NotFound'));

/*
import Home from "./pages/Home";
import About from "./pages/About";
import Board from "./pages/Board";
import BoardList from "./pages/BoardList";
import MainLayout from './layouts/MainLayout';
import NotFound from "./pages/NotFound";
*/

// 리액트 안에서 페이지 이동 - link
// id(경로변수, 자유로이 지정가능)란 명칭을 가지고 주소 접근
// index 키워드만 입력해도 처음 경로로 인식
// '/' - > 메인 주소라고 생각해도 무방
// 라우터에 적혀 있는 경로와 path와 경로가 같기 때문에 index(키워드, 상위 경로)로 대체해도 무방
const App = () => {
  return (
    <Routes>
      <Route path="/" element={<MainLayout />}> {/* path="/" 생략 가능 */}
        <Route index /* == {path="home"}*/ element={<Home />} />     {/* == /home */}
        <Route path="about" element={<About />} />  {/* == /about */}
        <Route path="board" element={<BoardList />} />
        <Route path="*" element={<NotFound />} /> {/* '*'-> 모든 페이지를 의미 */}
      </Route>
    </Routes>
  );

};

export default App;