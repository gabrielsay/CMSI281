/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntQueue.java
 *  Purpose       :  To practice working with Queues
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-20
 *  Description   :  This is a basic program that shows us how to pop, push, and peek in a queue.
 *                   Compared to stacks, queues use FIFO which is why it pushes out the value at the top.
 *  Warnings      :  None
 *  Exceptions    :  N/A
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-20  B.J Johnson   Initial set up
 *  @version 1.0.1  2018-09-26  Gabriel Say   Converted from IntStack to IntQueue
 *  @version 1.0.2  2018-09-27  Gabriel Say   Modified returnAt from IntLinkedList and added tests
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Stack;
public class IntQueue {

   IntLinkedList myQueue;

   IntQueue() {
      myQueue = new IntLinkedList();         // constructor
   }

   public int queueSize(){
     return myQueue.getSize();
   }

   public void push( int itemToPush ) {
      myQueue.prepend( itemToPush );
   }

   public int peek() {
      return myQueue.getIteratorAt(myQueue.getSize() - 1).getCurrentInt();     // we use the iterator
   }

   public int pop() {
     int qSize = myQueue.getSize();
      return myQueue.removeAt(qSize - 1);
   }

   public static void main( String[] args ) {
      IntQueue testQueue = new IntQueue();
      testQueue.push( 19 );
      testQueue.push( 23 );
      testQueue.push( 29 );
      testQueue.push( 31 );
      testQueue.push( 37 );
      testQueue.push( 41 );
      testQueue.push( 43 );
      testQueue.push( 47 );
      testQueue.push( 51 );
      testQueue.push( 57 );
      System.out.println("The current Queue size is: " + testQueue.queueSize() +"\n");
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 19
      System.out.println( "Removing top thing: " + testQueue.pop() );         // 19 removed
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 23
      System.out.println( "Removing top thing: " + testQueue.pop() );         // 23 removed
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 29
      System.out.println( "Removing top thing: " + testQueue.pop() );         // 29 removed
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 31
      testQueue.push( testQueue.pop() + testQueue.pop() );
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 41
      testQueue.push( 61 );
      testQueue.push( 68 );
      testQueue.push( 71 );
      testQueue.push( 75 );
      testQueue.push( 81 );
      testQueue.push( 87 );
      System.out.println("Inserted/Pushed 61, 68, 71, 75, 81, and 87\n");
      System.out.println("The current Queue size is: " + testQueue.queueSize() + "\n");
      System.out.println( "Removing top thing: " + testQueue.pop() );         // 41 removed
      System.out.println( "Removing top thing: " + testQueue.pop() );         // 43 removed
      System.out.println( "Removing top thing: " + testQueue.pop() );         // 47 removed
      testQueue.push( testQueue.pop() + testQueue.pop() );                    // Took sum of previous pops and removed it
      System.out.println( "The top of the stack: " + testQueue.peek() );      // 68

   }

}
