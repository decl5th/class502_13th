package exam01;

public class Student {
    private int classRoom;
    private String name;
    private int score;


    public Student(int classRoom, String name) {
        this.classRoom = classRoom;
        this.name = name;
    }

    public Student(int classRoom, String name, int score) {
        this.classRoom = classRoom;
        this.name = name;
        this.score = score; // 생성자 추가
    }

    public int getScore() {
        return score; // get 추가
    }

    public int getClassRoom() {
        return classRoom;
    }

    public String getName() {
        return name;
    }

    // 위 값을 확인해 줄수 있는 toString도 재정의
    @Override
    public String toString() {
        return "Student{" +
                "classRoom=" + classRoom +
                ", name='" + name + '\'' +
                '}';
    }
}
