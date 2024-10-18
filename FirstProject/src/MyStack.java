public class MyStack {
    public int num;
    public StudentInfo top;

    public MyStack() {
        this.num = 0;
        this.top = null;
    }

    public void push (StudentInfo studentToAdd) {
        if (num == 0) {
            top = studentToAdd;
        }
        else {
            studentToAdd.next = top;
            top = studentToAdd;
        }
        num++;
    }

    public StudentInfo pop () {
        if (num == 0) {
            return null;
        }
        StudentInfo temp;

        temp = top;
        top = top.next;
        temp.next = null;
        num--;
        return temp;
    }

    public StudentInfo peek () {
        return top;
    }

    public void display () {
        StudentInfo current = top;

        if (num == 0) {
            System.out.println("The list is empty");
        }

        while (current != null) {
            System.out.println(current.firstName);
            current = current.next;
        }
    }
}
