package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Starbucks starBucks = new Starbucks();
        TwoSomePlace twoSome = new TwoSomePlace();

        Person kim = new Person("김씨", 10000);
        Person lee = new Person("이씨", 15000);

        kim.setMenu("아메리카노");
        lee.setMenu("라떼");

        try {

            starBucks.enter(kim);
            starBucks.order();
            starBucks.exit();

        System.out.println();

        // 메서드 연결 = 메서드 체이닝을 통해 더 간단한 코드 표현 가능
        twoSome.enter(lee).order().exit();

            System.out.println();

            System.out.println(kim);
            System.out.println(lee);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("커피숍 매출액 요약");
        CoffeeShop.showSaleSummary(starBucks);
        CoffeeShop.showSaleSummary(twoSome);


    }
}
