package exam09;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer(); // 객체 생성
        Outer.Inner in = out.new Inner();
        in.method();
        System.out.println(Outer.Inner.num3);
    }
}
