package exam01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("테스트....")
public class Ex01Test {
    @Test
    @DisplayName("테스트1....")
    void test1() {
        Calculator cal = new Calculator();
        int a = 10;
        int b = 20;
        int result = cal.add(a, b);

        assertEquals(30, result);
        //System.out.println(result);
    }
    @Test
    @Disabled
    @DisplayName("테스트2....")
    void test2() {
        LocalDate expected = LocalDate.now();
        LocalDate date = LocalDate.of(2024,6,5);
        assertEquals(expected, date); // equals and hashCode

        assertSame(expected, date); // 테스트 실패
    }
    @Test
    @Disabled
    @DisplayName("테스트3....")
    void test3() {
        fail();
    }
}
