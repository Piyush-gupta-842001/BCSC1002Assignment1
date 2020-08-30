/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Roll Number = 36(O).
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks;

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
}

