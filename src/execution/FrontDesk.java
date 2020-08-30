/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Roll number: 36(O)
 *
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter your first name : " );
        String studentFirstName = scanner.nextLine ();
        System.out.println ( "Enter your middle name : " );
        String studentMiddleName = scanner.nextLine ();
        System.out.println ( "Enter your last name : " );
        String studentLastName = scanner.nextLine ();
        System.out.println ( "Enter your university roll number : " );
        long studentUniversityRollNumber = scanner.nextInt ();
        Student student = new Student ( studentFirstName, studentMiddleName, studentLastName, studentUniversityRollNumber );
        System.out.println ();
        System.out.println ( "<---------------------------->" );
        System.out.println ();
        System.out.println ( student );
        System.out.println ();
        System.out.println ( "-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-" + "\n" + "How may I help you today?" + "\n" + "1. Issue a new book for me."
                + "\n" + "2. Return a previously issues book for me." + "\n" + "3. Show me all my issues books." + "\n" + "4. Exit." );
        System.out.println ();
        System.out.println ( "Enter your choice : " );
        int userChoice = scanner.nextInt ();
        scanner.nextLine ();
        String bookName;
        String isbnNumber;
        switch (userChoice) {
            case 1 -> {
                System.out.print ( " *Enter the Book name and ISBN no. of the book : " );
                System.out.println ();
                bookName = scanner.nextLine ();
                isbnNumber = scanner.nextLine ();
                System.out.println ();
                if (bookName == bookName) {
                    System.out.println ( "Congratulations !" + '\'' + bookName + '\'' + " is issued to you." );
                } else {
                    System.out.println ( "Congratulations!!  The book having the " + '\'' + isbnNumber + '\'' + " ISBN Number is issued to you." );
                }
                System.out.println ( "Thank you, for visiting" );
            }
            case 2 -> System.out.println ( "Okay, i will do that for you !" );
            case 3 -> System.out.println ( "Okay, the list is below you." );
            case 4 -> System.out.println ( "Thank you, for visiting Library." );
            default -> System.out.println ( "Invalid Choice !!!!!:)" );
        }
    }
}
