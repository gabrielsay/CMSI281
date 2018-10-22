/*
 * A series of tests for Deque.java
 */

public class DequeTester {
   public static void main( String[] args ) {
      Deque myDeque = new Deque(10);

      System.out.println( "Testing isEmpty(): expect TRUE" );
      System.out.println( "isEmpty() result: " + myDeque.isEmpty() );
      System.out.println( "size() result: " + myDeque.size() );

      System.out.println( "-------------------------" );
      System.out.println( "Inserting left..." );
      myDeque.insertLeft(5);
      myDeque.insertLeft(4);
      myDeque.insertLeft(3);
      myDeque.insertLeft(2);
      myDeque.insertLeft(1);

      System.out.println( "Displaying deque..." );
      //myDeque.display();
      System.out.println( "Testing isFull(): expect FALSE" );
      System.out.println( "isFull() result: " + myDeque.isFull() );
      System.out.println( "size() result: " + myDeque.size() );

      System.out.println( "-------------------------" );
      System.out.println( "Inserting right..." );
      myDeque.insertRight(6);
      myDeque.insertRight(7);
      myDeque.insertRight(8);
      myDeque.insertRight(9);
      myDeque.insertRight(10);

      System.out.println( "Displaying deque..." );
      //myDeque.display();
      System.out.println( "peekFront() result: " + myDeque.peekFront() );
      System.out.println( "Testing isFull(): expect TRUE" );
      System.out.println( "isFull() result: " + myDeque.isFull() );
      System.out.println( "size() result: " + myDeque.size() );

      System.out.println( "-------------------------" );
      System.out.println( "Removing left..." );
      myDeque.removeLeft();
      myDeque.removeLeft();
      myDeque.removeLeft();

      System.out.println( "Displaying deque..." );
      //myDeque.display();
      System.out.println( "peekFront() result: " + myDeque.peekFront() );
      System.out.println( "Testing isFull(): expect FALSE" );
      System.out.println( "isFull() result: " + myDeque.isFull() );
      System.out.println( "size() result: " + myDeque.size() );

      System.out.println( "-------------------------" );
      System.out.println( "Removing right..." );
      myDeque.removeRight();
      myDeque.removeRight();
      myDeque.removeRight();

      System.out.println( "Displaying deque..." );
      //myDeque.display();
      System.out.println( "peekFront() result: " + myDeque.peekFront() );
      System.out.println( "Testing isFull(): expect FALSE" );
      System.out.println( "isFull() result: " + myDeque.isFull() );
      System.out.println( "size() result: " + myDeque.size() );

      myDeque.removeLeft();
      myDeque.removeLeft();
      myDeque.removeLeft();
      myDeque.removeLeft();
      myDeque.removeRight();
      myDeque.removeRight();
      myDeque.removeRight();
      myDeque.removeRight();

      System.out.println( "Testing isEmpty(): expect TRUE" );
      System.out.println( "isEmpty() result: " + myDeque.isEmpty() );
      System.out.println( "size() result: " + myDeque.size() );

      // System.out.println( "Attempt to remove item: expect error" );
      // myDeque.removeLeft();

      System.out.println( "***** TESTING COMPLETE *****");

   }
}
