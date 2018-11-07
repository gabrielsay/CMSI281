
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Simon {

   SimonLinkedList list;
   String[] letterArray = {"R", "G", "Y", "B"};

   public Simon() {
      list = new SimonLinkedList();
   }

   // Generates a new random color
   public String nextColor() {
      Random rand = new Random();
      int index = rand.nextInt( letterArray.length );
      return letterArray[index];
   }

}
