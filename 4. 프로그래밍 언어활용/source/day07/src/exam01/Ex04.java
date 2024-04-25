package exam01;

public class Ex04 {
    public static void main(String[] args) {
        // 객체를 만드는 과정 중에도 상속을 통하지 않고 메서드의 재정의가 가능
        A a = new A() {
          public void method() {
              System.out.println("재정의된 메서드!");
          }
        };

        a.method();
    }
}
