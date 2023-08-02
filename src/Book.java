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
}
