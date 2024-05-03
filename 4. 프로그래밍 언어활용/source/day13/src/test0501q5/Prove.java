package test0501q5;

public class Prove {
        public static void main(String[] args) {

            Singleton i1 = Singleton.getInstance();
            Singleton i2 = Singleton.getInstance();

            System.out.println(i1.toString());
            System.out.println(i2.toString());

            System.out.println(i1 == i2);
        }
}
