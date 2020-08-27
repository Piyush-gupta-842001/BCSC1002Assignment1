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


    public Book () {
        this.bookName = " ";
        this.authorName = " ";
        this.bookISBNNumber = 0;
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

    public String toString () {
        return String.format (
                "Book Name = %s, Author Name = %s, ISBN Number = %d",
                getBookName (), getAuthorName (), getBookISBNNumber ()
        );
    }

    @Override
    public boolean equals ( Object obj ) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass () != getClass ()) {
            return false;
        }
        Book book = (Book) obj;
        return this.getBookName () == book.getBookName () &&
                this.getAuthorName () == book.getAuthorName () &&
                this.getBookISBNNumber () == book.getBookISBNNumber ();

    }

    public int hashcode () {
        return Objects.hash ( getBookName (), getAuthorName (), getBookISBNNumber () );
    }


}