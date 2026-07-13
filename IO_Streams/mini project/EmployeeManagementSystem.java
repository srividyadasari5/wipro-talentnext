import java.util.ArrayList;
import java.util.Scanner;

class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();

                    employees.add(new Employee(id, name, age, salary));
                    break;

                case 2:
                    System.out.println("-----Report-----");
                    if (employees.isEmpty()) {
                        System.out.println("No Employees Found");
                    } else {
                        for (Employee e : employees) {
                            e.display();
                        }
                    }
                    System.out.println("-----End of Report-----");
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}