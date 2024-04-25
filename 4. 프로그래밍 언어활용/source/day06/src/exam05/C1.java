package exam05;

public class C1 implements A1, B1{
    @Override
    public void styleA() {

    }

    @Override
    public void styleB() {

    }

    @Override
     public void styleSame() {
        System.out.println("C1에서 재정의");
        System.out.println("A1 인터페이스의 디폴트 메서드 입니다");
    }
}
