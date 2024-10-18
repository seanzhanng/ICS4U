public class Main {
    public static void main(String[] args) {
        MyHashTable theHashTable = new MyHashTable(2);

        StudentInfo s1 = new StudentInfo(772998, "AB");
        StudentInfo s2 = new StudentInfo(771271, "AL");
        StudentInfo s3 = new StudentInfo(733623, "AL");
        StudentInfo s4 = new StudentInfo(736323, "AM");

        theHashTable.addToTable(s1);
        theHashTable.addToTable(s2);
        theHashTable.addToTable(s3);
        theHashTable.addToTable(s4);

        theHashTable.displayTable();

        System.out.println(theHashTable.removeFromTable(772998));

        theHashTable.displayTable();

        System.out.println(theHashTable.getFromTable(736323));

        theHashTable.displayTable();
    }
}