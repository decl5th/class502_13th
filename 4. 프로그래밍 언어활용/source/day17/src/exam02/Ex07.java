package exam02;

import java.time.LocalTime;

public class Ex07 {
    public static void main(String[] args) {
        LocalTime today = LocalTime.now();
        LocalTime time = LocalTime.of(17, 50, 0);

        System.out.println(today);
        System.out.println(time);
    }
}
