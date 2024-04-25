package exam01;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random gacha = new Random();
        for (int i = 0; i < 6; i++) {
            int num = gacha.nextInt();
            System.out.println( num );
            boolean bool = gacha.nextBoolean();
            System.out.println(bool);

        }
    }
}
