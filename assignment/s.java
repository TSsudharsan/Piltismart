import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class s {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Get date and time input from the user
        System.out.println("Enter date and time (YYYY-MM-DD HH:mm:ss):");
        String userInput = scanner.nextLine();

        // Define the date and time format expected from the user
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Parse the user input string into a LocalDateTime object
        LocalDateTime dateTime = LocalDateTime.parse(userInput, formatter);

        // Convert LocalDateTime to Unix time (Epoch time)
        long unixTime = dateTime.toEpochSecond(ZoneOffset.UTC);

        // Output Unix time
        System.out.println("Unix Time: " + unixTime);

        // Close the scanner
        scanner.close();
    }
}
