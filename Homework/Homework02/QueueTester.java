/*
 * A series of tests for Queue.java
 */

public class QueueTester {
   public static void main( String[] args ) {
      
      System.out.println( " " );
      System.out.println( "***** TESTING Queue.java *****");
      System.out.println( " " );

      Queue myQueue = new Queue(15);

      System.out.println( "- isEmpty() expects 'true'; result: " + myQueue.isEmpty() );

      System.out.println( "---------------------------------------" );
      System.out.println( "- Inserting values..." );
      myQueue.insert(11);
      myQueue.insert(52);
      myQueue.insert(8);
      myQueue.insert(39);
      myQueue.insert(46);
      myQueue.insert(77);
      myQueue.insert(25);
      myQueue.insert(38);
      myQueue.insert(99);
      myQueue.insert(100);
      
      System.out.print  ( "- QUEUE: " );
      myQueue.printQ();
      System.out.println( "- isEmpty() expects 'false'; result: " + myQueue.isEmpty() );
      System.out.println( "- peekFront() expects '11'; result: " + myQueue.peekFront() );
      System.out.println( "- size() expects '10'; result: " + myQueue.size() );


      System.out.println( "---------------------------------------" );
      System.out.println( "Testing remove()" );
      myQueue.remove();
      myQueue.remove();
      myQueue.remove();
      myQueue.remove();
      myQueue.remove();

      System.out.print  ( "- QUEUE: " );
      myQueue.printQ();
      System.out.println( "- isEmpty() expects 'false'; result: " + myQueue.isEmpty() );
      System.out.println( "- peekFront() expects '77'; result: " + myQueue.peekFront() );
      System.out.println( "- size() expects '5'; result: " + myQueue.size() );

      System.out.println( "---------------------------------------" );
      System.out.println( "Inserting more values..." );
      myQueue.insert(1);
      myQueue.insert(2);
      myQueue.insert(3);
      myQueue.insert(4);
      myQueue.insert(5);

      System.out.print  ( "- QUEUE: " );
      myQueue.printQ();
      System.out.println( "- isFull() expects 'false'; result: " + myQueue.isFull() );
      System.out.println( "- peekFront() expects '77'; result: " + myQueue.peekFront() );
      System.out.println( "- size() expects '10'; result: " + myQueue.size() );

      System.out.println( "---------------------------------------" );

      System.out.println( "Inserting more values..." );
      myQueue.insert(6);
      myQueue.insert(7);
      myQueue.insert(8);
      myQueue.insert(9);
      myQueue.insert(10);

      System.out.print  ( "- QUEUE: " );
      myQueue.printQ();
      System.out.println( "- isFull() expects 'true'; result: " + myQueue.isFull() );
      System.out.println( "- peekFront() expects '77'; result: " + myQueue.peekFront() );
      System.out.println( "- size() expects '15'; result: " + myQueue.size() );

      System.out.println( " " );
      System.out.println( "***** TESTING COMPLETE *****");
      System.out.println( " " );
   }
}
