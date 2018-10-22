/*
 * A series of methods for Stacks
 */

public class Stack {

   private class Link {
   private long lData;
   private Link next;

      private Link( long d ) {
         lData = d;
      }

      private void displayLink() {
         System.out.println( lData + " " );
      }
   }
//----------------------------------------------
   private Link first, current;
   private int nItems;

   public Stack() {
      first = null;
      current = null;
      nItems = 0;
   }

   public boolean isEmpty() {
      return( first == null );
   }

   public int getSize() {
      return nItems;
   }

   public void push( long value ) {
      Link linkToAdd = new Link( value );
      if( isEmpty() ) {
         first = linkToAdd;
      } else {
         linkToAdd.next = first;
         first = linkToAdd;
      }
      nItems++;
   }

   public long pop() {
      long temp = first.lData;
      if( isEmpty() ) {
         throw new IllegalArgumentException( "Error: popping from empty stack" );
      } else {
         first = first.next;
      }
      nItems--;
      return( temp );
   }

   public long peek() {
      if( isEmpty() ) {
         throw new IllegalArgumentException( "Error: popping from empty stack" );
      } else {
         return( first.lData );
      }
   }

   public void display() {
      Link current = first;
      while( current != null ) {
         current.displayLink();
         current = current.next;
      }
      System.out.println("");
   }
}
