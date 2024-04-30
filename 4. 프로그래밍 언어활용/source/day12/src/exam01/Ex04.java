package exam01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {

    public static void main(String[] args) {
        // 인터페이스가 객체가 되는 조건을 이용해서 객체 생성후 기준 부여
        // 기준 => 정렬 기준
        /*
        Comparator<String> comp = new Comparator<String>() { // 객체 생성
            @Override
            public int compare(String o1, String o2) {
                // return o1.comparTo(o2); // 오름 차순
               // return o2.compareTo(o1); // 내림차순
                return o1.compareTo(o2) * -1; // 음수값 => 내림차순
            }
        };

         */
        //Set<String> names = new TreeSet<>(comp); //객체 생성 // 다형성
        Set<String> names = new TreeSet<>(Comparator.reverseOrder());
        names.add("이름2");
        names.add("이름2");
        names.add("이름1");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");
        System.out.println(names);
    }
}
