package exam02;

public class A { // 정확한 클래스명 -> exam02.A 패키지명까지 포함해야함
    public int numA;
    int numAA; // default 접근 제어자, 동일 패키지내에서만 접근

    private int numAAA; // 클래스 A 내부에서만 접근 가능 -> Ex02에서 접근 불가능

    protected int numB;

    void printNum() {
        numAAA = 100;
        System.out.println(numAAA);

    }

}
