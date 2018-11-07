
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;

public class Simon {

   SimonLinkedList list;
   String[] letterArray = {"R", "G", "Y", "B"};

   public Simon() {
      list = new SimonLinkedList();
   }

   // Generates a new color randomly
   public String newColor() {
      Random rand = new Random();
      int index = rand.nextInt( letterArray.length );
      return letterArray[index];
   }

   // Prepends new color to list
   public void prependColor() {
      list.prepend( newColor() );
   }

}
