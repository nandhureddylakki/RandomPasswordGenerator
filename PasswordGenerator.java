import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";

    public static String generateRandomPassword(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be greater than zero.");
        }
        
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(randomIndex));
        }
        
        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12;
        String randomPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + randomPassword);
    }
}