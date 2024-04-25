package exam12;

public class Ex02 {
    public static void main(String[] args) {
        Calculator cal = new Calculator() { // 지역 내에서 정의하고 객체 생성
            @Override
            public int add(int num3, int num4) {
                return num3 * num4; // 정의 된 것이 없기 때문에 +만 쓰는 것이 아닌 다른 연산도 사용 가능
                // 직접 기능 정의
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
