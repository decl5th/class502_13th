package test0501q3;

public class Customer {
    private String name;
    private String menu;
    private int money;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
