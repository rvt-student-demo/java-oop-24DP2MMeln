package student.registration;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Validator {
    
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-zĀ-ž]{3,}$"); 
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$"); 
    private static final Pattern PERSONAL_CODE_PATTERN = Pattern.compile("^\\d{6}-\\d{5}$");

    public static void validateName(String name) {
        if (!NAME_PATTERN.matcher(name).matches()) {
            throw new IllegalArgumentException("Name is not valid. 3 symbols minnimum.");
        }

        
    }

    public static void validatelastName(String lastName) {
        if (!NAME_PATTERN.matcher(lastName).matches()) {
            throw new IllegalArgumentException("Last name is not valid. 3 symbols minnimum.");
        }
    }

    public static void validateEmail(String email) {
        if(!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email is not valid.");
        }
    }

    public static void validatePersonalCode(String personalCode) {
        if(!PERSONAL_CODE_PATTERN.matcher(personalCode).matches()) {
            throw new IllegalArgumentException("Invalid personal code.");
        }
    }
}
