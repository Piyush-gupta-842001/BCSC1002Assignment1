/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Section = O(36)
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

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

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Book book = (Book) o;
        return getBookISBNNumber () == book.getBookISBNNumber () &&
                Objects.equals ( getBookName (), book.getBookName () ) &&
                Objects.equals ( getAuthorName (), book.getAuthorName () );
    }

    @Override
    public int hashCode () {
        return Objects.hash ( getBookName (), getAuthorName (), getBookISBNNumber () );
    }
}