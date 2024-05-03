package exam01;

public class Book {
    private int isbn;
    private String title;

    public Book(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

   Book () {}; // 기본 생성자

    @Override
    public String toString() { // toString 메서드 재정의
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                '}';
    }
}
