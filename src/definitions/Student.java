/*  Created by IntelliJ IDEA.
 *  User: Piyush Kumar Gupta
 *  Roll no. = 36(O)
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    public String getStudentFirstName () {
        return studentFirstName;
    }

    public void setStudentFirstName ( String studentFirstName ) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName () {
        return studentMiddleName;
    }

    public void setStudentMiddleName ( String studentMiddleName ) {
        this.studentMiddleName = studentMiddleName;
    }

    public String getStudentLastName () {
        return studentLastName;
    }

    public void setStudentLastName ( String studentLastName ) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFullName () {
        return studentFullName;
    }

    public void setStudentFullName ( String studentFullName ) {
        this.studentFullName = studentFullName;
    }

    public long getStudentUniversityRollNumber () {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber ( long studentUniversityRollNumber ) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfBooksIssuedByTheStudent () {
        return numberOfBooksIssuedByTheStudent;
    }

    public void setNumberOfBooksIssuedByTheStudent ( int numberOfBooksIssuedByTheStudent ) {
        this.numberOfBooksIssuedByTheStudent = numberOfBooksIssuedByTheStudent;
    }

    public Book[] getNameOfAllTheBooksIssuedByTheStudent () {
        return nameOfAllTheBooksIssuedByTheStudent;
    }

    public void setNameOfAllTheBooksIssuedByTheStudent ( Book[] nameOfAllTheBooksIssuedByTheStudent ) {
        this.nameOfAllTheBooksIssuedByTheStudent = nameOfAllTheBooksIssuedByTheStudent;
    }

    @Override
    public String toString () {
        return "Student Information --->" + "\n" +
                "Student Name : '" + studentFullName + '\'' + "\n" +
                "Student University Roll Number : " + studentUniversityRollNumber + "\n" +
                "Number Of Books Issued By The Student : " + numberOfBooksIssuedByTheStudent + "\n" +
                "Name Of All The Books Issued By The Student : " + Arrays.toString ( nameOfAllTheBooksIssuedByTheStudent );
    }

    @Override
    public boolean equals ( Object object ) {
        if (this == object) return true;
        if (object == null || getClass () != object.getClass ()) return false;
        Student student = (Student) object;
        return getStudentUniversityRollNumber () == student.getStudentUniversityRollNumber () &&
                getNumberOfBooksIssuedByTheStudent () == student.getNumberOfBooksIssuedByTheStudent () &&
                Objects.equals ( getStudentFirstName (), student.getStudentFirstName () ) &&
                Objects.equals ( getStudentMiddleName (), student.getStudentMiddleName () ) &&
                Objects.equals ( getStudentLastName (), student.getStudentLastName () ) &&
                Objects.equals ( getStudentFullName (), student.getStudentFullName () ) &&
                Arrays.equals ( getNameOfAllTheBooksIssuedByTheStudent (), student.getNameOfAllTheBooksIssuedByTheStudent () );
    }

    @Override
    public int hashCode () {
        int result = Objects.hash ( getStudentFirstName (), getStudentMiddleName (), getStudentLastName (), getStudentFullName (), getStudentUniversityRollNumber (), getNumberOfBooksIssuedByTheStudent () );
        result = 31 * result + Arrays.hashCode ( getNameOfAllTheBooksIssuedByTheStudent () );
        return result;
    }
}