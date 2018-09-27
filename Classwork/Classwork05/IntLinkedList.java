/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntLinkedList.java
 *  Purpose       :  To practice working with Nodes
 *  @author       :  Gabe Say w/Jordyn
 *  Date written  :  2018-09-20
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
 *  @version 1.0.0  2018-09-20  Gabriel Say   Initial set up
 *  @version 1.0.1  2018-09-26  Gabriel Say   Modified returnAt to work in IntQueue
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntLinkedList {

      private Node node;
      private int  size;

     // the constructor
      IntLinkedList() {
         node = null;
         size = 0;
      }

      public int getSize() {
         return size;
      }

      public void insertAt( int index , int num ) {
        if(index > size || index < 0){
          throw new IllegalArgumentException();
        } else {
        Iterator it = getIteratorAt( index );
        Node nodeToAdd = new Node( num );
        nodeToAdd.next = it.currentNode.next;
        it.currentNode.next = nodeToAdd;
      }
      size++;
    }

      public int removeAt( int index ) {
          if ( index > size -1 || index < 0 ) {
              throw new IllegalArgumentException( "Invalid index." );
          }
          Iterator deleteIt = getIteratorAt(index);
          Node rem = deleteIt.currentNode.next;
          Iterator myIt = getIteratorAt(index-1);
          myIt.currentNode.next = rem;
          size--;
          return deleteIt.getCurrentInt();
          }

      public void prepend( int dataToAdd ) {
         Node currentnode = node;
         node = new Node( dataToAdd );
         node.next = currentnode;
         size++;
      }

      private class Node {

         int data;            // remember this is an IntLinkedList
         Node next;           // here's the self-referential part

         // constructor
         Node( int d ) {
            data = d;
            next = null;
         }
      }

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

      public class Iterator {
         private Node currentNode;

         Iterator() {
            currentNode = node;
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

         public int getCurrentInt() {
            return currentNode.data;
         }
      }
   }
