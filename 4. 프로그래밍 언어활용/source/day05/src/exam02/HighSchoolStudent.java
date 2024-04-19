package exam02;

public class HighSchoolStudent extends Student {

    public HighSchoolStudent() {
        //super(); // 매개변수가 없는 기본 생성자 형태라 오류 발생
        super(100, "jon"); // 매개변수가 있는 생성자로 정의하면 오류 해결
        // 상위 클래스에 기본 생성자가 없으면 오류
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
