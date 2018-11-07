
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

   // Prints elements on specified interval/delay time
   public void printInterval( int delay ) {
      try {
         Thread.sleep( delay );
      } catch( InterruptedException e ) {
         Thread.currentThread().interrupt();
      }
   }

   /**
      flashList() is supposed to display the most recent list for some specified interval
      After that interval is up, it will delete the list from the console window
   **/
   public void flashList() {
      String displayList, deleteList = "";

   }

}
