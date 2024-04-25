package exam02error;


import java.io.FileInputStream;
import java.io.IOException;

public class Ex06 {
    //try-with-resources로 자원 해제 -> 다형성을 이용한 원리
    // try(...)에 자원 객체를 전달하면, try 코드 블록이 끝나고 자동으로 자원해제 기능
    // 따로 finally 구문이나 모든 catch구문에 종료 처리 하지 않아도 됨
    // try에 전달할 수 잇는 자원은 AutoCloseable 인터페이스의 구현체로 한정
    // try()안에 복수의 자원 객체 전달 가능
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("a.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
