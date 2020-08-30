/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Roll no. = 36(O)
 * */
package definitions;

public class Student {
    private String studentFirstName;
    private String studentMiddleName;
    private String studentLastName;
    private String studentFullName;
    private long studentUniversityRollNumber;
    private int numberOfBooksIssuedByTheStudent;
    private Book[] nameOfAllTheBooksIssuedByTheStudent;

    public Student ( String studentFirstName, String studentMiddleName, String studentLastName, long studentUniversityRollNumber ) {
        studentFullName = studentFirstName + " " + studentMiddleName + " " + studentLastName;
        this.studentFullName = studentFullName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }


}