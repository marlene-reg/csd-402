import java.util.ArrayList;
import java.util.Scanner;
 
public class AnimalArrayList {
   public static void main(String[] args) {
      ArrayList<String> stringList = new ArrayList<>();
      stringList.add("pig");
      stringList.add("dog");
      stringList.add("horse");
      stringList.add("skunk");
      stringList.add("raccoon");
      stringList.add("frog");
      stringList.add("coyote");
      stringList.add("bird");
      stringList.add("rabbit");
      stringList.add("lizard");
 
      for (String animal : stringList) {
         System.out.println(animal);
      }
 
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter index for element:");
      int index = scanner.nextInt();
 
      try { 
         if (index >= 0 && index < stringList.size()) {
            System.out.println("Animal: " + stringList.get(index)); 
         } else {
            System.out.println("Index is invalid!");
         }
      } catch (Exception e) { 
         System.out.println("An error occurred: " + e.getMessage());
      }
      scanner.close();
   }
}