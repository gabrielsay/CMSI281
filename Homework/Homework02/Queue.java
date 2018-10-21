/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Queue.java
 *  Purpose       :  To practice working with Nodes
 *  @author       :  Gabe Say
 *  Date written  :  2018-10-15
 *  Description   :  This implements the insertAt() which takes an integer index location and a data value
 *                   and inserts a node with that data value BEFORE the node at that index. The removeAt()
 *                   method takes an integer index location ONLY, and removes the noce at that index.
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
