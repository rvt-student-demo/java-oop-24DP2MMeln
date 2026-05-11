package student.registration;
import java.io.IOException; import java.nio.file.*; 
import java.time.LocalDateTime; 
import java.util.ArrayList; 
import java.util.List;

public class FileHandler {

    private final Path filePath;

    public FileHandler(String fileName) { 
        this.filePath = Paths.get(fileName);
    }

    public List<Student> loadStudents() { 
        List<Student> students = new ArrayList<>();
        if(!Files.exists(filePath)) {
            return students;
        }
        try {
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i).trim();
                if (!line.isEmpty()) {
                    students.add(Student.fromCsvRow(line));
                }
            }
        } catch (IOException e) {
            System.out.println("Couldn't read the file: " + e.getMessage());
        } return students;
    }

    public void saveStudents(List<Student> students) {
        List<String> lines = new ArrayList<>();
        lines.add("name,lastname,email,personalCode,date");
        for (Student s : students) {
            lines.add(s.toCsvRow());
        }
        try {
            Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) { System.out.println("Neizdevās saglabāt failu: " + e.getMessage());
    }
    
  }
}