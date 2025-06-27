import java.io.*;
import java.util.Scanner;

public class NotesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "notes.txt";

        while (true) {
            System.out.println("\n1. Write Note");
            System.out.println("2. Read Notes");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String note = scanner.nextLine();
                    writeNoteToFile(fileName, note);
                    break;
                case 2:
                    readNotesFromFile(fileName);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void writeNoteToFile(String fileName, String note) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(note + "\n");
            System.out.println("Note saved.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void readNotesFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\n--- Your Notes ---");
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file or file doesn't exist.");
        }
    }
}
