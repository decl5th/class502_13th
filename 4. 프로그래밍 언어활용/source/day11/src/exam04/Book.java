package exam04;

public class Book {
    // 변수 선언
    private int isbn;
    private String title;
    private String author;

    // 생성자 메서드 생성
    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
