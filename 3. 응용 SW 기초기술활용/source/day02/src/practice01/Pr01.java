package practice01;

public class Pr01 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.9;

        int num3 =  num1 * (int)num2; // wrong
        int num4 = (int)(num1 * num2); // 정답

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }



}
