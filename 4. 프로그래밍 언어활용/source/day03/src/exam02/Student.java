package exam02;

public class Student {
    // 생성자 초기화 구현
    public static int id;
    private String name = "jon"; // name의 값을 입력한게 아니라 정의한 것 후에 객체 정의 시 jon을 대입하겠다는 의미
    private String subject;

    public Student() {};

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static void staticMethod() {
        // 객체와 상관없이 사용 가능, this 지역 변수 존재X -> 객체의 자원 접근 X -> name & subject 접근 안됨
        System.out.println("정적 메서드!!");
        //  name = "이이름" 성립되지 않음
    }

    public void instanceMethod () { // 지역 변수 0 : 객체 자원 접근
        System.out.println("동적 메서드!!"); //Ex02에서는 호출 안됨 Ex01에서는 객체 정의되어 있어 호출 가능
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
