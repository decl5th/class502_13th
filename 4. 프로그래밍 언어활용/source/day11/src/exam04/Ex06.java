package exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(100,"책1","저자1"));
        books.add(new Book(101,"책2","저자2"));
        books.add(new Book(102,"책3","저자3"));
        books.add(new Book(103,"책4","저자4"));
        books.add(new Book(104,"책5","저자5"));



        Iterator<Book> iter = books.iterator();
        while(iter.hasNext()) { // 커서 이동 방식으로 반복
            Book book = iter.next();
            System.out.println(book);
        }

        System.out.println("___________________________");

        // 두번째 반복을 위한 새로운 iterator 생성
        iter = books.iterator();
        while(iter.hasNext()) {
            Book book = iter.next();
            System.out.println(book);
        }

       /*
        while (iter.hasNext()) { // 두번째 반복은 안됨 커서이동이 마지막으로 끝났기 때문
            Book book = iter.next();
            System.out.println(book);
        }

        */
    }

}
