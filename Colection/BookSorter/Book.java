package Colection.BookSorter;

public class Book implements Comparable<Book> {
    private String bookName;
    private int paper;
    private String writerName;
    private int publishDate;


    public Book(String bookName,int paper, String writerName,int publishDate){
        this.bookName=bookName;
        this.paper=paper;
        this.writerName=writerName;
        this.publishDate=publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return getBookName().compareTo(o.getBookName());
    }
}
