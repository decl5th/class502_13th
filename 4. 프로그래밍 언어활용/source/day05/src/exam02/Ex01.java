package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Human jon = new Human(); // Human객체 안에 Animal 객체 포함
        //jon.move();

        Tiger bengal = new Tiger(); // Tiger객체 안에 Animal 객체 포함
        //bengal.move();

        Bird eagle = new Bird(); // Bird객체 안에 Animal 객체 포함
        //eagle.move();

        //Human[] animals = new Human[3];
        //animals[0] = jon;
        // animals[1] = bengal;  Tiger에 속한 자료형이라 Human과는 다른 자료형이기에 성립안됨

        Animal[] animals = new Animal[3];
        animals [0] = jon;
        animals [1] = bengal;
        animals [2] = eagle;


        // animals [] = {jon, bengal, eagle}; 자체 작성 틀린 구문 Ex02 정답구문

        // for (int i = 0; i< animals.length; i++) {
            //animals[i].move();
        //}
        for (Animal animal : animals) {
            animal.move();
        }

    }
}
