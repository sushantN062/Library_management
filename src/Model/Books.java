package Model;

public class Books {
    String book_name;
    String author;

    public Books(String book_name, String author, String published, int ISBN) {
        this.book_name = book_name;
        this.author = author;
        this.published = published;
        this.ISBN = ISBN;
    }

    String published;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    int ISBN;

    public void result(){
        System.out.println("Name:" +book_name);
        System.out.println("Author: "+ author);
        System.out.println("ISBN" + ISBN);
        System.out.println("Published on: "+published);
    }
}
