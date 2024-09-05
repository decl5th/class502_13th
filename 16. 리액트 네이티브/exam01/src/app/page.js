import Link from "next/link";

const Home = () => {
  return (
    <>
      <h1>메인페이지</h1>
      <div>
        <h2>SSR</h2>
        <a href="/member/join">회원가입</a>
      </div>
      <div>
        <h2>CSR</h2>
        <p><Link href="/board/view/1">1번 게시글</Link></p>
        <p><Link href="/board/view/2">2번 게시글</Link></p>
      </div>
    </>
  );
};

export default Home;