package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "jon", "Java");
        Student s2 = new Student( 1001, "arik", "react");

        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2 );

        System.out.println(s1.id);
        System.out.println(s2.id);

        s1.instanceMethod(); // 객체 정의 했기 때문에 접근 가능
    }
}
