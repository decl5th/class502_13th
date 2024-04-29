package exam01;

public class Ex09 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        int fare = trans.getFare();
        System.out.println(fare);

        int total = trans.getTotal(4);
        System.out.println(total);


    }
}
