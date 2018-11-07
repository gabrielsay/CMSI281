
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

   // String representation of the list which contains all the colors
   public String listToString() {
      String listString = "";
      for ( int i = 0; i < list.getSize(); i++ ) {
         listString += list.getIteratorAt(i).getCurrentString();
      }
      return listString;
   }

   // Compares user's input to list
   public boolean compare( String guess ) {
      boolean match;
      if( guess.equals(listToString()) ) {
         match = true;
      } else {
         match = false;
      }
      return match;
   }
}
