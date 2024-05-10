package exam03;

import java.awt.*;
import java.text.ChoiceFormat;

public class Ex05 {
    public static void main(String[] args) {
       /* double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};
        ChoiceFormat cf = new ChoiceFormat(limits, grades); */
        String pattern = "60#D|70#C|80<B|90#A"; // 경계선 구분 작업; 비교 연산자 < 사용
        ChoiceFormat cf = new ChoiceFormat(pattern);
        /**
         *  80#B => 70이상 80미만 : C
         *  80<B => 70이상 80이하 : C, 81~90 미만 : B
         */
        int[] scores = {100, 70, 55, 80, 95, 87};
        // 81점부터 B를 부여하고 싶다면? 경계선 구분
        for (int score : scores) {
            String grade = cf.format(score);
            System.out.printf("점수: %d, 학점: %s%n", score, grade);
        }
    }
}

