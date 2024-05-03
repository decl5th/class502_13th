package test0501q3;

import java.util.Map;

public abstract class AbsCoffeeShop implements CoffeeShop{
    String name;
    Map<String, Integer> menu;
    private Customer p1;

    public AbsCoffeeShop(String name, Map<String, Integer> menu){
        this.name = name;
        this.menu = menu;
    }


    @Override
    public CoffeeShop order(Customer p1) {
        String menu = p1.getMenu();

        int money = p1.getMoney();
        p1.setMoney(money);

        System.out.printf("%s가 %s에서 %s를 %d원에 주문했습니다.%n", p1.getName(), name, menu, p1.getMoney());

        return this;
    }

    @Override
    public String getName() {
        return name;
    }
}
