package student.registration;

import java.time.LocalDateTime;
import java.util.List;

public class StudentService {
    private FileHandler fileHandler;
    private List<Student> students;

    public StudentService(String fileName) {
        this.fileHandler = new FileHandler(fileName);
        this.students = fileHandler.loadStudents();
    }

    // Register new student
    public void registerStudent(String firstName, String lastName, String email, String personalCode) throws IllegalArgumentException {
        // Validate input
        Validator.validateName(firstName);
        Validator.validatelastName(lastName);
        Validator.validateEmail(email);
        Validator.validatePersonalCode(personalCode);

        // Check for duplicate email
        for (Student s : students) {
            if (s.getEmail().equalsIgnoreCase(email)) {
                throw new IllegalArgumentException("Email is already registered.");
            }
        }

        // Check for duplicate personal code
        for (Student s : students) {
            if (s.getPersonalCode().equals(personalCode)) {
                throw new IllegalArgumentException("Personal code is already registered.");
            }
        }

        // Create new student and add to list
        Student student = new Student(firstName, lastName, email, personalCode);
        students.add(student);
        fileHandler.saveStudents(students);
    }
}