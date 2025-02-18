package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String tile, String autor) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(tile, autor);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }

    }

    public void showBook(){
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.tile + ", 저자: " + book.autor);
        }
    }

    private static class Book {
        private String tile;
        private String autor;

        public Book(String tile, String autor) {
            this.tile = tile;
            this.autor = autor;
        }
    }
}
