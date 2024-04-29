package exam01;

public class Ex05 {
    public static void main(String[] args) {
        String tran1 = "BUS";

        //Transportation BUS = Enum.valueOf(Transportation.class, tran1);
        //System.out.println(BUS.name());

        Transportation Bus = Transportation.valueOf(tran1);
        System.out.println(tran1);
    }
}
