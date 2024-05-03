package test0501q3;

public class Ex01 {
    public static void main(String[] args) {
        StarBucks starBucks = new StarBucks();
        CoffeeBean bean = new CoffeeBean();

        Customer kim = new Customer("김씨", 4000);
        Customer lee = new Customer("이씨", 4500);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        starBucks.order(kim);
        bean.order(lee);

    }

}
