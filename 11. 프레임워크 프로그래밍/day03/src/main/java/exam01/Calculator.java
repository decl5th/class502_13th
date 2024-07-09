package exam01;

public interface Calculator {
    // 동적 프록시는 인터페이스를 통한 프록시이기 때문에
    // ⇒ 사용전 인터페이스 정의가 필수
    long factorial(long num);
}
