package test0501q9;

public class MyDog {
    String name;
    String type;

    public MyDog(String name, String type) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return type + " " + name;
    }
}