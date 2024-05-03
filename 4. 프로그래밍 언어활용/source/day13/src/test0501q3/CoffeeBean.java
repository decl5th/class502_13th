package test0501q3;

import java.util.HashMap;
import java.util.Map;

public class CoffeeBean  extends AbsCoffeeShop {

    private static Map<String, Integer> menu;

    static {
        menu = new HashMap<>();
        menu.put("아메리카노", 4000);
        menu.put("라떼", 4500);
    }

    public CoffeeBean() {
        super("커피빈", menu);

    }
}
