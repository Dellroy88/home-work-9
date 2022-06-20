public class Main {



    public static void main(String[] args) {
        Author author = new Author("Stiven", "King");
        Book book = new Book("The Green Mile", author, 1996);
        System.out.println("Название книги - " + book.getBookName() + ", Автор книги - " + author.getName() + " " + author.getSurname() + ", Год выпуска книги - " + book.getYearOfRelease());
        book.setYearOfRelease(1999);
        System.out.println("Название книги - " + book.getBookName() + ", Автор книги - " + author.getName() + " " + author.getSurname() + ", Год выпуска книги - " + book.getYearOfRelease());
    }
}