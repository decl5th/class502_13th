package exam02;

public class Student {
    protected int id;
    protected String name;

    // public Student() {} 방법 1 기본 생성자 추가
    // 정의를 안한다면? HighSchoolStudent의 생성자에서 자동생성된 super()에 매개변수 입력

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
