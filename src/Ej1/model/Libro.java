package Ej1.model;

public class Libro {
    private Integer isbn;
    private String title;
    private String author;
    private Integer numPages;

    public Libro() {
    }

    public Libro(Integer isbn, String title, String author, Integer numPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "isbn=" + isbn +
               ", title='" + title + '\'' +
               ", author='" + author + '\'' +
               ", numPages=" + numPages;
    }
}
