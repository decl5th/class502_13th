package exam03;

import java.util.Map;
// 하위클래스 (StarBucks, TwoSomePlace) 공통적인 객체 자원 정의
public abstract class AbstractCoffeeShop implements CoffeeShop {
    private String name; // 커피숍 이름
    private int totalSalePrice; // 매출
    private Map<String, Integer> meuns; // 메뉴
    private Person person; // person객체 할당

    public AbstractCoffeeShop(String name, Map<String, Integer> menus) {
        this.name = name; // 추상 클래스 메서드 정의
        this.meuns = menus;
    }

    @Override
    public CoffeeShop enter(Person person) {
        this.person = person;
        System.out.printf("%s님이 %s에 입장하였습니다.%n", person.getName(), name);

        return this;
    }

    @Override
    public CoffeeShop order() {
        String menu = person.getMenu();
        if (menu == null) {// 메뉴를 선택하지 않으면 예외처리
            throw new RuntimeException("메뉴를 선택하세요");
        }

        int price = meuns.getOrDefault(menu, 0);
        if (price == 0) {
            throw new RuntimeException("없는 메뉴 입니다.");
        }

        int money = person.getMoney();
        if (money < price) {
            throw new RuntimeException(menu + "를 구입하기엔 부족한 금액입니다.");
        }

        totalSalePrice += price;
        money -= price;
        person.setMoney(money);

        System.out.printf("%s님이 %s에서 %s를 %d원에 주문했습니다.%n", person.getName(), name, menu, price);

        return this;
    }
    public void exit() {
        System.out.printf("%s님이 %s에서 퇴장하였습니다.%n", person.getName(), name);
        person = null;
    }

    public int getTotalSalePrice() {
        return totalSalePrice;
    }

    public String getName() {
        return name;
    }



}
