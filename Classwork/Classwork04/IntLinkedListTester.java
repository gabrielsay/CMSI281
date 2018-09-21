/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedListTester.java
 *  Purpose       :  To practice working with Nodes
 *  @author       :  Gabe Say w/Jordyn
 *  Date written  :  2018-09-20
 *  Description   :  This implements the insertAt() and removeAt() methods from IntLinkedList
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-20  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntLinkedListTester {

   public static void main( String[] args ) {
      IntLinkedList myList = new IntLinkedList();
      myList.prepend( 23 );
      myList.prepend( 19 );
      myList.prepend( 17 );
      myList.prepend( 13 );
      myList.prepend( 11 );
      myList.prepend(  7 );
      myList.prepend(  5 );
      myList.prepend(  3 );
      myList.prepend(  2 );
      myList.prepend( 13 );
      IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
      myIt = myList.getIteratorAt( 3 );
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
      myIt.next();
      System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17

      System.out.println("\nTesting insertAt & removeAt methods: \n");

      myList.insertAt(3,68);
      myIt = myList.getIteratorAt(4);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //68
      myList.removeAt(4);

      myList.insertAt(8,17);
      myIt = myList.getIteratorAt(9);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //17
      myList.removeAt(9);

      myList.insertAt(6,918);
      myIt = myList.getIteratorAt(7);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //918
      myList.removeAt(7);

      myList.insertAt(4,32);
      myIt = myList.getIteratorAt(5);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //32
      myList.removeAt(5);

      myList.insertAt(9,12);
      myIt = myList.getIteratorAt(10);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //12
      myList.removeAt(10);

      myList.insertAt(8,143);
      myIt = myList.getIteratorAt(9);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //143

      myList.insertAt(10,16);
      myIt = myList.getIteratorAt(11);
      System.out.println( "Current Node is: " + myIt.getCurrentInt() ); //16
   }
}
