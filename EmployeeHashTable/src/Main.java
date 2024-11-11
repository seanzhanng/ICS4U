import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        MyHashTable table = new MyHashTable(10);

        while(true) {
            int option = homeScreen();

            if (option == 1) {
                System.out.print("Enter employee number: ");
                int empNum = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();

                System.out.print("Enter gender (0 for male, 1 for female): ");
                int gender = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter work location: ");
                String workLoc = scanner.nextLine();

                System.out.print("Enter your deduct rate: ");
                double deductRate = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Full-Time or Part-Time (f/p): ");
                String fullOrPart = scanner.nextLine().toLowerCase();

                EmployeeInfo newEmployee = null;

                if (fullOrPart.equals("f")) {
                    FTE fullTimeEmployee = new FTE();
                    fullTimeEmployee.empNum = empNum;
                    fullTimeEmployee.firstName = firstName;
                    fullTimeEmployee.lastName = lastName;
                    fullTimeEmployee.gender = gender;
                    fullTimeEmployee.workLoc = workLoc;
                    fullTimeEmployee.deductRate = deductRate;
                    
                    System.out.print("Enter yearly salary: ");
                    fullTimeEmployee.yearlySalary = scanner.nextDouble();
                    scanner.nextLine();
                    
                    newEmployee = fullTimeEmployee;
                } 
                else if (fullOrPart.equals("p")) {
                    PTE partTimeEmployee = new PTE();
                    partTimeEmployee.empNum = empNum;
                    partTimeEmployee.firstName = firstName;
                    partTimeEmployee.lastName = lastName;
                    partTimeEmployee.gender = gender;
                    partTimeEmployee.workLoc = workLoc;
                    partTimeEmployee.deductRate = deductRate;

                    System.out.print("Enter hourly wage: ");
                    partTimeEmployee.hourlyWage = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter hours per week: ");
                    partTimeEmployee.hoursPerWeek = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter weeks per year: ");
                    partTimeEmployee.weeksPerYear = scanner.nextDouble();
                    scanner.nextLine();

                    newEmployee = partTimeEmployee;
                }

                table.addToTable(newEmployee);
                System.out.println("Employee added successfully.");
                continue;
            }
            else if (option == 2) {
                System.out.print("Enter employee number: ");
                int empNum = scanner.nextInt();
                scanner.nextLine();

                EmployeeInfo refNumber = table.getFromTable(empNum);
                System.out.println("First name: " + refNumber.firstName);
                System.out.println("Last name: " + refNumber.lastName);
                System.out.println("Gender: " + refNumber.gender);
                System.out.println("Work Location: " + refNumber.workLoc);
                System.out.println("Deduct Rate: " + refNumber.deductRate);

                continue;
            }
            
            else if (option == 3) {
                System.out.print("Enter employee number: ");
                int empNum = scanner.nextInt();
                scanner.nextLine();

                table.removeFromTable(empNum);
                System.out.println("Employee removed successfully.");
                continue;
            }

            else if (option == 4) {
                System.out.println("Exiting program.");
                break;
            }
        }

    }
    public static int homeScreen() {
        System.out.println("Choose an action:");
        System.out.println("1. Add a new employee");
        System.out.println("2. Search for an employee by employee number");
        System.out.println("3. Remove an employee by employee number");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}