package exam03;

// 커피숍에 대한 설계
public interface CoffeeShop {

    CoffeeShop enter(Person person);
    CoffeeShop order(); // 커피숍 매출 증가, 주문한 사람 비용 차감
    void exit(); // 주문 다하면 나가는 행동 정의
    int getTotalSalePrice(); // 총 매출액
    String getName(); // 커피숍 이름 조회

    // 어떤 커피숍이든 매출 볼 수 있도록 정적 메서드로 정의
    static void showSaleSummary(CoffeeShop shop)
    {// CoffeeShop shop 다형성 활용
        System.out.printf("%s의 총 매출액은 %d원 입니다.%n", shop.getName(),shop.getTotalSalePrice());
    }
}
