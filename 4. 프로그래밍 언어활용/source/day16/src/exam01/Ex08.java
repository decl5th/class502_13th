package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap; // toMap에 커서를 두고 alt + enter => 자동추가

public class Ex08 {
    public static void main(String[] args) {
        // 반(classRomm)별로 학생들 분리 (toMap을 이용하여)
        Student[] students = {
                new Student(1, "teemu"),
                new Student(1, "jon"),
                new Student(1, "arik"),

                new Student(2, "dari"),
                new Student(2, "taylor"),
                new Student(2, "julia"),

                new Student(3, "nesa"),
                new Student(3, "chris"),
                new Student(3, "altman"),
        };

        /* 반별로 나누고 싶었지만 복잡해질 가능성 있어짐;;
        Map<Integer, String> data = Arrays.stream(students).collect(toMap(Student::getClassRoom, Student::getName));

        System.out.println(data);
        */

        // grounpingBy()를 사용해서 복잡함을 단순화
        Map<Integer, List<Student>> data = Arrays.stream(students).collect(Collectors.groupingBy(Student::getClassRoom));

        List<Student> students2 = data.get(2);
        //System.out.println(students2);
        students2.forEach(System.out::println);
    }
}
