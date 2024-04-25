package exam06;

public class Book {
    private int isbn; // 도서 번호
    private String title; // 책 제목
    private String author; // 저자

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        // return super.toString(); // super -> 상위클래스 객체의 주소값 지칭
        return String.format("isbn=%d, title=%s, author=%s%n", isbn, title, author);
    }
}
