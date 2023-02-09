public class Student {
    String firstName;
    String lastName;
    char gender;
    Address address;
    StudentGrade studentGrade;

    public Student(String firstName, String lastName, char gender, Address address, StudentGrade studentGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.studentGrade = studentGrade;
    }
}
