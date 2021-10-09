package xml.parsingjaxb;
public class Book {
    private String title;
    private String author;
    private String id;
    private long isnb;

    public Book() {}

    public Book(String title, String author, String id, long isnb) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.isnb = isnb;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getIsnb() {
        return isnb;
    }

    public void setIsnb(long isnb) {
        this.isnb = isnb;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", isnb=" + isnb +
                '}';
    }
}
