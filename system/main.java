package system;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n==== Student Manager Menu ====");
            System.out.println("1. Add a student");
            System.out.println("2. Find a student by ID");
            System.out.println("3. List all students");
            System.out.println("4. Exit");
            System.out.println("Choose an option(1-4)");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:

                    scanner.nextLine();
                    System.out.println("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.println("Enter student ID: ");
                    int id = scanner.nextInt();

                    System.out.println("Enter student grade: ");
                    double grade = scanner.nextDouble();

                    manager.addStudent(name,id,grade);
                    break;
                case 2:

                    System.out.println("Enter student ID to find: ");
                    int searchID = scanner.nextInt();
                    Student found = manager.findStudentId(searchID);
                    if (found != null){
                        System.out.println("Found: " + found);
                    }else {
                        System.out.println("Student not found in system");
                    }
                    break;
                case 3:

                    manager.listStudent();
                    break;
                case 4:
                    System.out.println("Exiting system");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again");
            }

        }

    }
}
