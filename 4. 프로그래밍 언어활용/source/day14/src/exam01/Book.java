package exam01;

import java.util.function.Supplier;

public class Book {
    private String title;

    public String getTitle() {
        return title;
    }

    public void printTitle() {
        Supplier<String> t1 = () -> getTitle();
        Supplier<String> t2 = this::getTitle; // 현재 객체 자원인 this에서 메서드 참조
    }


}
