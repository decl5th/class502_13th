package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int floor = 10;
        switch(floor) {
            case 1:
                System.out.println("1층 약국");
                break;
            case 2:
                System.out.println("2층 정형외과");
                break;
            case 3:
                System.out.println("3층 피부과"); // 3부터 출력 시작 지점
                break;

            case 4:
                System.out.println("4층 치과");
                break; // 실행(출력) 흐름 종료
            case 5:
                System.out.println("5층 헬스클럽");
                break;
            default:
                System.out.println("없는 층입니다");
        }
    }
}
