package exam02;

public class Tiger extends Animal {
    @Override
    public void move() {
        //super.move(); super -> 상속받은 객체의 move 메소드 지칭
        System.out.println("네발로 뛰어다닌다.");
    }

    public void hunting () {
        System.out.println("사냥을 한다.");
    }
}
