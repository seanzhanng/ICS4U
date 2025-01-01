public class Main {
    public static void main (String[] args) {
        
        MyQueue queue = new MyQueue();
        MyStack stack = new MyStack();

        
        queue.enqueue(new StudentInfo(1, "A", "A", 1, 1));
        queue.enqueue(new StudentInfo(1, "B", "B", 1, 1));
        queue.enqueue(new StudentInfo(1, "C", "C", 1, 1));        

        //queue.display();

        queue.dequeue();

        //queue.display();

        System.out.println(queue.peek().firstName);
        
        
        /*
        stack.push(new StudentInfo(1, "C", "C", 1, 1));
        stack.push(new StudentInfo(1, "B", "B", 1, 1));
        stack.push(new StudentInfo(1, "A", "A", 1, 1));

        stack.display();

        stack.pop();

        stack.display();

        System.out.println(stack.peek().firstName);
        */
    }
}
