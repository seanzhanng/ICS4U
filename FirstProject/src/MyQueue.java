public class MyQueue {
    public int num;
    public StudentInfo front;

    public MyQueue() {
        this.num = 0;
        this.front = null;
    }

    public void enqueue (StudentInfo studentToAdd) {
        if (num == 0) {
            front = studentToAdd;
        }
        StudentInfo current = front;
        while (current.next != null) {
            current = current.next;
        }
        current.next = studentToAdd;
        studentToAdd.next = null;
        num++;
    }

    public StudentInfo dequeue () {
        if (num == 0) {
            return null;
        }
        StudentInfo temp;

        temp = front;
        front = front.next;
        temp.next = null;
        num--;
        return temp;
    }

    public StudentInfo peek () {
        return front;
    }

    public void display () {
        StudentInfo current = front;

        if (num == 0) {
            System.out.println("The list is empty");
        }

        while (current != null) {
            System.out.println(current.firstName);
            current = current.next;
        }
    }
}
