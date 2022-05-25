package d_23_5_2022;

public class Book {

    private String ISBN;
    private String title;
    private int releaseYear;
    private Author author;

    public Book(String ISBN, String title, int releaseYear, Author author) {
        this.ISBN = ISBN;
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void print(){
        System.out.println(this.ISBN);
        System.out.println(this.title + " - " + this.releaseYear);
        System.out.print("Author: ");
        this.author.print();
    }
}
