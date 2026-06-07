package student.registration;

import java.util.Scanner;

public class Main {
    private static StudentService service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new StudentService("data/students.csv");
        scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            displayMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    register();
                    break;
                case "2":
                    show();
                    break;
                case "3":
                    remove();
                    break;
                case "4":
                    edit();
                    break;
                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n========== STUDENT REGISTRATION SYSTEM ==========");
        System.out.println("1. Register new student");
        System.out.println("2. Show all students");
        System.out.println("3. Remove student");
        System.out.println("4. Edit student");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private static void register() {
        System.out.println("\n--- Register New Student ---");
        try {
            System.out.print("First Name: ");
            String firstName = scanner.nextLine().trim();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine().trim();

            System.out.print("Email: ");
            String email = scanner.nextLine().trim();

            System.out.print("Personal Code (format: XXXXXX-XXXXX): ");
            String personalCode = scanner.nextLine().trim();

            service.registerStudent(firstName, lastName, email, personalCode);
            System.out.println("✓ Student registered successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }

    private static void show() {
        System.out.println("\n--- All Students ---");
        service.showAllStudents();
    }

    private static void remove() {
        System.out.println("\n--- Remove Student ---");
        try {
            System.out.print("Enter Personal Code (format: XXXXXX-XXXXX): ");
            String personalCode = scanner.nextLine().trim();
            service.removeStudent(personalCode);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }

    private static void edit() {
        System.out.println("\n--- Edit Student ---");
        try {
            System.out.print("Enter Personal Code of student to edit (format: XXXXXX-XXXXX): ");
            String personalCode = scanner.nextLine().trim();

            // Check if student exists
            if (service.findByPersonalCode(personalCode) == null) {
                System.out.println("✗ Student not found.");
                return;
            }

            System.out.print("New First Name: ");
            String firstName = scanner.nextLine().trim();

            System.out.print("New Last Name: ");
            String lastName = scanner.nextLine().trim();

            System.out.print("New Email: ");
            String email = scanner.nextLine().trim();

            service.editStudent(personalCode, firstName, lastName, email);
            System.out.println("✓ Student updated successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error: " + e.getMessage());
        }
    }
}
