package exam06;

import java.util.Objects;

public class Ex01 {
    public static void main(String[] args) {
        String str = null;

        str = Objects.requireNonNullElse(str, "기본값");
        System.out.println(Objects.requireNonNullElse(str, ""));

        str.toUpperCase(); // NullPointerException(NPE) 발생
    }
}
