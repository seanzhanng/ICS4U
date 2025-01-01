public class Main {
    public static void main(String[] args) {
        MyBinaryTree theTree = new MyBinaryTree();

        StudentInfo s1 = new StudentInfo(8, "sean");
        StudentInfo s2 = new StudentInfo(3, "sean");
        StudentInfo s3 = new StudentInfo(10, "sean");
        StudentInfo s4 = new StudentInfo(1, "sean");
        StudentInfo s5 = new StudentInfo(6, "sean");
        StudentInfo s6 = new StudentInfo(14, "sean");

        theTree.preorder(theTree.root);
        theTree.postorder(theTree.root);
        theTree.inorder(theTree.root);

        theTree.addToTree(theTree.root, s1);
        theTree.addToTree(theTree.root, s2);
        theTree.addToTree(theTree.root, s3);
        theTree.addToTree(theTree.root, s4);
        theTree.addToTree(theTree.root, s5);
        theTree.addToTree(theTree.root, s6);

        theTree.preorder(theTree.root);
        System.out.println();
        theTree.inorder(theTree.root);
        System.out.println();
        theTree.postorder(theTree.root);
        System.out.println();

        System.out.println(theTree.num);

    }
}