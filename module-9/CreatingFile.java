import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
 
public class CreatingFile {
  public static void main(String[] args) {
      File file = new File("dataFile.txt");
 
      if (!file.exists()) {
          try {
              if (file.createNewFile()) {
                  System.out.println("File created: " + file.getName());
                } 
	         else {
                    System.out.println("File not created.");
                 }
            } 
	        catch (IOException e) {
                System.out.println("Error creating file.");
                e.printStackTrace();
            }
        } 
		 else {
            System.out.println("File exists.");
                 }
 
        String fileName = "numbers.txt";
        boolean append = true;
 
        try (FileWriter writer = new FileWriter(fileName, append)) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                writer.write(randomNumber + " ");
            }
            writer.write("\n");
            System.out.println("10 numbers have been written to file.");
        } 
	    catch (IOException e) {
            System.err.println("Error with writing to the file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
        catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
        }
    }
}