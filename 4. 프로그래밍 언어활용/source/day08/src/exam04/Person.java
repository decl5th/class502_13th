package exam04;

public class Person {
    private String name;
    private int age;

    public Person() {} //디폴트 생성자

    public Person(String name) { //이름만 입력받는 생성자
        this.name = name;
    }
    public Person(String name, int age) { // 이름, 나이를 입력받는 생성자
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
