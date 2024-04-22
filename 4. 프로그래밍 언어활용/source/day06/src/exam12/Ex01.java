package exam12;

public class Ex01 {
    public static void main(String[] args) { //
        Outer out = new Outer();
        Calculator cal = out.method(30);
        // 멤버변수는 본래 스택 영역이라 쓰고 나면 없어지는데
        // num3은 없어지지 않고 result2에도 남아있다
        // 즉, 스택영역이 아닌 데이터 혹은 힙에 저장되어있다는 것인데
        // 내부클래스 적용시에는 데이터 영역에 저장
        // 데이터영역에는 바뀌지 않는 것들이 저장 -> num3 지역변수가 상수화가 되었다
        int result = cal.add(10, 20); // 30 + 10 + 20
        System.out.println(result);

        int result2 = cal.add(20,30); // 30 + 20 + 30
        System.out.println(result2);
    }
}
