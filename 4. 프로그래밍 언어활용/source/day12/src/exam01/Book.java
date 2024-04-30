package exam01;

import java.util.Objects;

public class Book implements Comparable <Book> {
    // 단순한 데이터 용도의 클래스
    private int isbn; // 도서 번호
    private String title; // 도서명
    private String author; // 저자
    // private을 통해 통제 => 직접적으로 변수를 조작하는 것은 좋지 않다

    // 생성자를 통해서 값을 설정; 조회하고 변경
    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book)obj;
            if (isbn == book.isbn && title.equals(book.title) && author.equals(book.author)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author);
        // 같은 값에 대해서 같은 hash 반환
    }

    // toString 메서드 재정의 => 값 확인을 위함
    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return isbn - o.isbn; //오름차순
        //return o.isbn - isbn; //내림차순
    }
}
