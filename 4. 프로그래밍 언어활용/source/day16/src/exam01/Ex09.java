package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex09 {
    // 점수를 기준으로 학생들을 양분
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "teemu", 80),
                new Student(1, "jon", 60),
                new Student(1, "arik", 55),

                new Student(2, "dari", 100),
                new Student(2, "taylor", 90),
                new Student(2, "julia", 30),

                new Student(3, "nesa", 60),
                new Student(3, "chris", 90),
                new Student(3, "altman", 50),
        };

        Map<Boolean, List<Student>> data = Arrays.stream(students).collect(Collectors.partitioningBy(s -> s.getScore() >= 70));

        List<Student> students1 = data.get(true); // 70점 이상인 학생 목록
        students1.forEach(System.out::println);
    }
}
