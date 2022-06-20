public class Book {
    private final String bookName;
    private final Author author;
    int yearOfRelease;

    public Book(String bookName, Author author, int yearOfRelease) {
        this.author = author;
        this.bookName = bookName;
        this.yearOfRelease = yearOfRelease;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int newYearOfRelease) {
        this.yearOfRelease = newYearOfRelease;
    }
}
