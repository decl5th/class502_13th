package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("book.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Book book1 = new Book(1000, "책1", "저자1");
            Book book2 = new Book(1001, "책2", "저자2");

            oos.writeObject(book1);
            oos.writeObject(book2);
            oos.writeObject("HelloWorld"); // 문자열 객체 추가 저장


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
