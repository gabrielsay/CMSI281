
/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  oddEvenSort.java
 *  Purpose       :  To practice using sorting systems and sorting by using the odd-even sort method
 *  @author       :  Alvin, Jordyn, Gabe
 *  Date written  :  2018-11-06
 *  Description   :  Java implementation of the game "Simon" which uses SimonLinkedList.java
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

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
      int i = rand.nextInt( letterArray.length );
      return letterArray[i];
   }

   // Prepends new color to list
   public void prependColor() {
      list.prepend( newColor() );
   }

   // String representation of the list which contains all the colors
   public String listToString() {
      String listString = "";
      for ( int i = 0; i < list.getSize(); i++ ) {
         listString += ( list.getIteratorAt(i).getCurrentString() + " " );
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

   // Flashes list in console for brief interval, then clears the line
   public void flashList() {
      String listString = "";
      String  blankLine = "";

      listString = listToString();                       // Turns list into string

      for ( int i = 0; i < listString.length(); i++ ) {  // Displays characters on specified interval
         System.out.print( listString.charAt(i) );
         printInterval( 1000 );
      }

      for ( int i = 0; i < listString.length(); i++ ) {
         blankLine += "\b";
      }

      for ( int i = 0; i < listString.length(); i++ ) {
         blankLine += " ";
      }

      System.out.println( blankLine );
   }

}
