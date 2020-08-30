/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Section = O(36)
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private long bookISBNNumber;

    public Book ( String bookName, String authorName, long bookISBNNumber ) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getBookName () {
        return bookName;
    }

    public void setBookName ( String bookName ) {
        this.bookName = bookName;
    }

    public String getAuthorName () {
        return authorName;
    }

    public void setAuthorName ( String authorName ) {
        this.authorName = authorName;
    }

    public long getBookISBNNumber () {
        return bookISBNNumber;
    }

    public void setBookISBNNumber ( long bookISBNNumber ) {
        this.bookISBNNumber = bookISBNNumber;
    }

    @Override
    public String toString () {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookISBNNumber=" + bookISBNNumber +
                '}';
    }


}