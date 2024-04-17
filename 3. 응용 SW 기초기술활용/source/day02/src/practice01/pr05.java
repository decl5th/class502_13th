package practice01;

public class pr05 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단----------------------");
            for (int j = 1; j <= 9; j++) {
                if (i > j)
                    continue; // 단보다 곱하는 수가 크거나 같은 경우 구문
                System.out.printf("%d X %d = %d%n", i, j , i * j);
            }


        }

    }
}
