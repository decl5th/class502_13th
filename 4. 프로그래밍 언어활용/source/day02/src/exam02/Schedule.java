package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year) { // year라는 값을 설정 할 set 메서드 정의
        year = _year;
    }

    public int getYear() {
        return year; // get메서드를 이용해서 변수명만 볼 수 있게 함
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int _day) {
        // 로직을 설정해서 변수의 통제가능성이 생김 -> 2월 31일이란 false값을 통제할 수 있게 된다
        if (month == 2 && _day > 28) {
            _day = 28;
        }
        day = _day;
    }

    public int getDay() {
        return day;
    }

    void showDate() {
        System.out.printf("%d년 / %d월 / %d일%n", year, month, day);
    }
}
