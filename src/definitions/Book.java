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


}