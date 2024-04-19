package exam02;

import exam01.B;

public class Ex02 {
    public static void main(String[] args) {
        Animal [] animals = {new Human(), new Bird(), new Tiger() };

        for (Animal animal : animals) {
            animal.move();

            if (animal instanceof Human) { // 강제 형변환을 위한 출처 확인
                Human mason = (Human) animal; // 강제 형변환
                mason.reading();
            }   else if (animal instanceof Tiger) {
                Tiger whiteTiger = (Tiger) animal;
                whiteTiger.hunting();
            }
        }

    }
}
