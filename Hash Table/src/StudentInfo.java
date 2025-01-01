public class StudentInfo {

    public final StudentInfo left = null;
    public int studentNumber;
    public String firstName;
    public StudentInfo right;
    
    public StudentInfo(int studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }
}