package student.registration;
import java.time.LocalDateTime;

public class Student {
    String firstName;
    String lastName;
    String email;
    String personalCode;
    LocalDateTime date;

public Student (String firstName, String lastName, String email, String personalCode, LocalDateTime date) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.personalCode = personalCode;
    this.date = date;
}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String toCsvRow() {
        return String.join(",", firstName, lastName, email, personalCode, date.toString());
    }

    public static Student fromCsvRow(String line) {
        String[] parts = line.split(",");
        return new Student( parts[0], parts[1], parts[2], parts[3], LocalDateTime.parse(parts[4]) );
    }
}


