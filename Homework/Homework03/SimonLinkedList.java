/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SimonLinkedList.java
 *  Purpose       :  Stores and manages data needed to run Simon game
 *  @author       :  Alvin, Jordyn, Gabe
 *  Date written  :  2018-11-05
 *  Description   :  Uses IntLinkedList.java methods but converted to strings
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-11-05  Alvin Lai     Initial set up: copied IntLinkedList.java methods and
 *                                            modified to work with strings
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

public class SimonLinkedList {
   
   private Node head;
   public  int  size;
   //-----------------------------------------------------------------
   private class Node {

      String data;
      Node next;

      Node( String d ) {
         data = d;
         next = null;
      }
   }
   //-----------------------------------------------------------------
   public class Iterator {
      private Node currentNode;

      Iterator() {
         currentNode = head;
      }

      public void next() {
         if( currentNode == null ) {
            return;
         } else {
            currentNode = currentNode.next;
         }
      }

      public boolean hasNext() {
         return ((currentNode != null) && (currentNode.next != null));
      }

      public String getCurrentString() {
         return currentNode.data;
      }

      public Node getCurrentNode() {
         return currentNode;
      }
   }
   //-----------------------------------------------------------------
   public Iterator getIteratorAt( int index ) {
      if( (index > size) || (index < 0) ) {
         throw new IllegalArgumentException();
      }
      Iterator it = new Iterator();
      while( index > 0 ) {
         it.next();
         index--;
      }
      return it;
   }
   //-----------------------------------------------------------------
   SimonLinkedList() {
      head = null;
      size = 0;
   }
   //-----------------------------------------------------------------
   public int getSize() {
      return size;
   }
   //-----------------------------------------------------------------
   public void prepend( String dataToAdd ) {
      Node currentHead = head;
      head = new Node( dataToAdd );
      head.next = currentHead;
      size++;
   }
   //-----------------------------------------------------------------   
   public void insertAt( int index, String data ) {
      Iterator it = new Iterator();
      it = getIteratorAt( index - 1 );
      Node newNode = new Node( data );
      Node currentNode = it.getCurrentNode();
      newNode.next = currentNode.next;
      currentNode.next = newNode;
      size++;                   
   }
   //-----------------------------------------------------------------
   // removes a node from a given index
   public void removeAt( int index ) {
      Iterator it = new Iterator();
      it = getIteratorAt( index - 1 );
      Node currentNode = it.getCurrentNode();
      Node targetNode = currentNode.next.next;
      currentNode.next = targetNode;
      size--;
   }
   //-----------------------------------------------------------------
   // TODO: clear list
}
