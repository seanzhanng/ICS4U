public class MyBinaryTree {
    
    public StudentInfo root;
    public int num;

    public MyBinaryTree() {
        root = null;
        num = 0;
    }

    public void addToTree(StudentInfo currentNode, StudentInfo studentToAdd) {
        if (num == 0) {
            root = studentToAdd;
            num++;
            return;
        }

        if (studentToAdd.studentNumber < currentNode.studentNumber) {
            if (currentNode.left == null) {
                currentNode.left = studentToAdd;
                num++;
            } else {
                addToTree(currentNode.left, studentToAdd);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = studentToAdd;
                num++;
            } else {
                addToTree(currentNode.right, studentToAdd);
            }
        }
    }

    public void preorder(StudentInfo currentNode) {
        if (currentNode == null) {
            return;
        }
        System.out.println(currentNode.studentNumber);
        preorder(currentNode.left);
        preorder(currentNode.right);
    }

    public void postorder(StudentInfo currentNode) {
        if (currentNode == null) {
            return;
        }
        postorder(currentNode.left);
        postorder(currentNode.right);
        System.out.println(currentNode.studentNumber);
    }

    public void inorder(StudentInfo currentNode) {
        if (currentNode == null) {
            return;
        }
        inorder(currentNode.left);
        System.out.println(currentNode.studentNumber);
        inorder(currentNode.right);
    }
}
