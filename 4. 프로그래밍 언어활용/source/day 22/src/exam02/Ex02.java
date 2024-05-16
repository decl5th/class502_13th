package exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex02 {
    // 직렬화 복구 작업 = 역직렬화
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream("book.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book1 = (Book)ois.readObject();
            System.out.println(book1);

            Book book2 = (Book)ois.readObject();
            System.out.println(book2);

            String str = (String)ois.readObject();
            System.out.println(str);
            // 저장한 순서대로 복구 진행해야함
            // 순서대로 복구 진행 안하면 에러 발생

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
