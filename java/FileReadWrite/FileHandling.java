import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {
      // Writing to file and then reading from it
        try {

            FileWriter fw = new FileWriter("student.txt");

            fw.write("Name: Shravani Patil\n");
            fw.write("Age: 22\n");
            fw.write("City: Mumbai");

            fw.close();

            System.out.println("Data written successfully");
// Reading from the file
            File file = new File("student.txt");

            Scanner sc = new Scanner(file);

            System.out.println("\nFile Contents:");

            while (sc.hasNextLine()) {

                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }
}