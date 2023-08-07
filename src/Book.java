import java.util.Objects;

public class Book {
    private String title;
    private Author autor;
    private int publishingYear;

    public Book(String title, Author autor, int publishingYear) {
        this.title = title;
        this.autor = autor;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAutor() {
        return autor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor=" + autor +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, publishingYear);
    }
}
