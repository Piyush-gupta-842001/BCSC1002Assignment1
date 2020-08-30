/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Roll Number = 36(O).
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

    public Library ( Book[] availableBooks ) {
        this.availableBooks = availableBooks;
    }

    public Book[] getAvailableBooks () {
        return availableBooks;
    }

    public void setAvailableBooks ( Book[] availableBooks ) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString () {
        return "Library{" +
                "availableBooks=" + Arrays.toString ( availableBooks ) +
                '}';
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Library library = (Library) o;
        return Arrays.equals ( getAvailableBooks (), library.getAvailableBooks () );
    }

    @Override
    public int hashCode () {
        return Arrays.hashCode ( getAvailableBooks () );
    }
}

