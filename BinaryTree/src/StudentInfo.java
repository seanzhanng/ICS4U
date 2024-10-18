public class StudentInfo {
    public int studentNumber;
    public String firstName;
    public StudentInfo left;
    public StudentInfo right;

    public StudentInfo(int studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.left = null;
        this.right = null;
    }
}
