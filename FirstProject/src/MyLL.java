
public class MyLL {
	
	// The list manager class!
	
	public StudentInfo front;
	public int num;
	
	public MyLL() {
		front = null;
		num = 0;
	}
	
	
	public void addToFront(StudentInfo studentToAdd) {
		
		if (num == 0) {
			front = studentToAdd;
			studentToAdd = null; // force this, just to be safe!
			num++;
			return;
		}
		
		if (num > 0) {
			studentToAdd.next = front;
			front = studentToAdd;
			num++;
			return;
		}
		
	}
	
    public void addToRear(StudentInfo studentToAdd) {
        if (num == 0)
        {
            front = studentToAdd;
            studentToAdd.next = null;
            num++;
            return;
        }

        StudentInfo current = front;
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = studentToAdd;
        studentToAdd.next = null;
        num++;
		return;
    }
	
	public StudentInfo removeFromFront() {
		if (num == 0) {
			return null;
		}
		StudentInfo temp = front;
		front = front.next;
		temp.next = null;
		num--;
		return temp;
	}

	public StudentInfo removeFromRear() {
		
		StudentInfo current = front;
		StudentInfo temp;

		if (num == 0) {
			return null;
		}
		if (num == 1) {
			temp = current;
			front = null;
			return temp;
		}

		while (current.next.next != null) {
			current = current.next;
		}
		temp = current.next;
		current.next = null;
		num--;
		return temp;
	}

	public void addToPosition(StudentInfo studentToAdd, int pos) {

		if (num <= 0) {
			addToFront(studentToAdd);
			return;
		}

		if (pos >= num) {
			addToRear(studentToAdd);
			return;
		}

		StudentInfo current = front;

		for (int n = 1; n < pos; n++) {
			current = current.next;
		}
		studentToAdd.next = current.next;
		current.next = studentToAdd;
		num++;

	}

	public void displayList() {
		
		// Walk through the list from front to rear and print out the first name!
		StudentInfo currentStudent = front;
		if (currentStudent == null) {
			System.out.println("\n\nThe list is empty!\n");
		}
		else {
			System.out.println("\nHere is the list from front to rear!");
			while (currentStudent != null) {
				System.out.println(currentStudent.firstName);
				currentStudent = currentStudent.next;
			}
		}
		
	}
	

}
