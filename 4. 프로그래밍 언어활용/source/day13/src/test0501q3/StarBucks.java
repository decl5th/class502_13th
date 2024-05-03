package test0501q3;

import java.util.HashMap;
import java.util.Map;

public class StarBucks extends AbsCoffeeShop{
    private static Map<String, Integer> menu;

    static {
        menu = new HashMap<>();
        menu.put("아메리카노", 4000);
        menu.put("라떼", 4300);
    }

    public StarBucks() {
        super("스타벅스", menu);
    }
}
