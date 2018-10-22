/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Queue.java
 *  Purpose       :  To practice working with Queues
 *  @author       :  Gabe, Alvin, Jordyn
 *  Date written  :  2018-10-15
 *  Description   :  This program is meant to model a queue using the insert, remove, and
 *                   printQ methods (i.e. FiFo).
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-10-15  Gabriel Say   Initial set up
 *  @version 1.0.1  2018-10-17  Alvin Lai     Edited remove() and printQ()
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
// Queue.java
// Demonstrates queue
// To run this program: C>java QueueTester.java
////////////////////////////////////////////////////////////////
public class Queue{
   private int maxSize;
   private long[] queArray;
   private int front;
   private int rear;
   private int nItems;
//--------------------------------------------------------------
   public Queue( int s ) {               // constructor
      maxSize = s;
      queArray = new long[maxSize];
      front = 0;
      rear = -1;
      nItems = 0;
   }
//--------------------------------------------------------------
   public void insert( long j ) {        // put item at rear of queue
      if( rear == maxSize - 1 )
         rear = -1;                      // deal with wraparound
      queArray[++rear] = j;              // increment rear and insert
      nItems++;                          // one more item
   }
//--------------------------------------------------------------
   public long remove() {                // take item from front of queue
      // long temp = queArray[front++];     // get value and incr front
      // if( front == maxSize )             // deal with wraparound
      //    front = 0;
      // nItems--;                          // one less item
      // return temp;

      long temp = queArray[front];           // save front value
      for( int i = 0; i < nItems; i++ ) {    // shift items
         queArray[i] = queArray[i + 1];
      }
      rear--;                                // adjust rear reference
      nItems--;                              // account nItems for deleted item
      return temp;
   }
//--------------------------------------------------------------
   public long peekFront() {             // peek at front of queue
      return queArray[front];
   }
//--------------------------------------------------------------
   public void printQ() {
      // int temp = front;
      for ( int i = 0; i < nItems; i++ ) {
         System.out.print( queArray[i] + ", " );
         if ( i == maxSize ) {
            i = 0;
         }
      }
      System.out.println( "" );
   }
//--------------------------------------------------------------
   public boolean isEmpty() {            // true if queue is empty
      return ( nItems == 0 );
   }
//--------------------------------------------------------------
   public boolean isFull() {             // true if queue is full
      return ( nItems == maxSize );
   }
//--------------------------------------------------------------
   public int size() {                   // number of items in queue
      return nItems;
   }
//--------------------------------------------------------------
}
////////////////////////////////////////////////////////////////
// class QueueApp {
//    public static void main( String[] args ){
//       Queue theQueue = new Queue(5);

//          theQueue.insert(10);
//          theQueue.insert(20);
//          theQueue.insert(30);
//          theQueue.insert(40);

//          theQueue.remove();
//          theQueue.remove();
//          theQueue.remove();

//          theQueue.insert(50);
//          theQueue.insert(60);
//          theQueue.insert(70);
//          theQueue.insert(80);

//          while( !theQueue.isEmpty() ) {
//          long n = theQueue.remove(); // (40, 50, 60, 70, 80)
//          System.out.print(n);
//          System.out.print( " " );
//          }

//        System.out.println( "" );
//    } // end main()
// } // end class QueueApp
