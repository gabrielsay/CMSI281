/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  PriorityQApp.java
 *  Purpose       :  To practice using heaps
 *  @author       :  Lafore, Jordyn, Alvin, Gabe,
 *  Date written  :  2018-11-28
 *  Description   :  This implements the heap method when using priority queues
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-11-26  Jordyn        Initial Setup
 *  @version 1.0.1  2018-11-28  Alvin         Fixed formatting
 *  @version 1.0.2  2018-11-28  Alvin         Added tests
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.io.*;

class Node {
   private int iData;             

   public Node( int key ) { 
      iData = key; 
   }

   public int getKey() {
      return iData; 
   }

   public void setKey( int id ) {
      iData = id;
   }
} 

class Heap {
   private Node[] heapArray;
   private int maxSize;           
   private int currentSize;       

   public Heap( int mx ) {
      maxSize = mx;
      currentSize = 0;
      heapArray = new Node[maxSize]; 
   }

   public boolean isEmpty() {
      return currentSize == 0; 
   }

   public boolean insert( int key ) {
      if( currentSize == maxSize ) {
         return false;
      }

      Node newNode = new Node( key );
      heapArray[currentSize] = newNode;
      trickleUp( currentSize++ );
      return true;
   }

   public void trickleUp( int index ) {
      int parent = ( index - 1 ) / 2;
      Node bottom = heapArray[index];

      while( index > 0 &&
             heapArray[parent].getKey() < bottom.getKey() ) {
         heapArray[index] = heapArray[parent]; 
         index = parent;
         parent = ( parent - 1 ) / 2;
      } 
      heapArray[index] = bottom;
   } 

   public Node remove() {                           
      Node root = heapArray[0];
      heapArray[0] = heapArray[--currentSize];
      trickleDown(0);
      return root;
   } 

   public void trickleDown( int index ) {
      int largerChild;
      Node top = heapArray[index];       
      while( index < currentSize / 2 ) {                               
         int leftChild = 2*index+1;
         int rightChild = leftChild+1;

         if(rightChild < currentSize && 
                             heapArray[leftChild].getKey() <
                             heapArray[rightChild].getKey()) {
            largerChild = rightChild;
         } else {
            largerChild = leftChild;
         }

         if( top.getKey() >= heapArray[largerChild].getKey() ) {
            break;
         }

         heapArray[index] = heapArray[largerChild];
         index = largerChild;            
      }
      heapArray[index] = top;           
   } 

   public boolean change( int index, int newValue ) {
      if( index < 0 || index >= currentSize ) {
         return false;
      }

      int oldValue = heapArray[index].getKey(); 
      heapArray[index].setKey( newValue ); 

      if( oldValue < newValue ) {
         trickleUp(index); 
      } else {
         trickleDown( index ); 
      }                               
      return true;
   }

   public void displayHeap() {
      System.out.print( "heapArray: " );  
      for( int m = 0; m < currentSize; m++ ) {
         if( heapArray[m] != null )
            System.out.print( heapArray[m].getKey() + " ");
         else
            System.out.print( "-- ");         
      }
      System.out.println();

      // int nBlanks = 32;
      // int itemsPerRow = 1;
      // int column = 0;
      // int j = 0;                          
      // String dots = "...............................";
      // System.out.println( dots + dots );     

      // while( currentSize > 0 ) {
         // if( column == 0 ) {
         //    for( int k = 0; k < nBlanks; k++ ) {
         //       System.out.print(' ');               
         //    }             
         // }                 
      //    System.out.print( heapArray[j].getKey() );

      //    if( ++j == currentSize ) {
      //       break;
      //    }
      //    if( ++column == itemsPerRow ){
      //       nBlanks /= 2;               
      //       itemsPerRow *= 2;            
      //       column = 0;               
      //       System.out.println();       
      //    } else {                             
      //       for( int k = 0; k < nBlanks * 2 - 2; k++ ) {
      //          System.out.print(' ');     
      //       }
      //    } 
      // System.out.println( "\n" + dots + dots ); 
      // } 
   }
}

class PriorityQ {
   private int maxSize;

   private Heap theHeap;
   private int nItems;

   public PriorityQ( int s ) {
      maxSize = s;

      theHeap = new Heap(s);
      nItems = 0;
   }

   public void insert( int item ) {
      int j;
      theHeap.insert( item );
      nItems++;
   }

   public int remove() {
      Node root = theHeap.remove();
      nItems--;
      return root.getKey();
   }

   public boolean isEmpty() {
      return ( nItems == 0 ); 
   }

   public boolean isFull() {
      return ( nItems == maxSize );
   }

   public int getMaxSize() {
      return maxSize;
   }

   public void display() {
      theHeap.displayHeap();
   }
}

public class PriorityQApp {
   public static void main( String[] args ) {

      System.out.println( "***** TESTING PriorityQ.java *****" );
      PriorityQ thePQ = new PriorityQ(5);
      System.out.println( "MAX SIZE OF HEAP: " + thePQ.getMaxSize() );

      System.out.println( "Inserting items to heap..." );
      thePQ.insert(30);
      thePQ.insert(50);
      thePQ.insert(10);
      thePQ.insert(40);
      thePQ.insert(20);

      thePQ.display();
      System.out.println( "Is heap full?: " + thePQ.isFull() );

      System.out.print( "Items removed: " );
      while( !thePQ.isEmpty() ) {
         int item = thePQ.remove();
         System.out.print( item + " " );
      }
      System.out.println( "" );
      System.out.println( "Is heap empty?: " + thePQ.isEmpty() );

      System.out.println( "Inserting items to heap..." );
      thePQ.insert(1);
      thePQ.insert(39);
      thePQ.insert(6);

      
      System.out.println( "Is heap full?: " + thePQ.isFull() );
      System.out.println( "Is heap empty?: " + thePQ.isEmpty() );

      System.out.println( "Inserting items to heap..." );
      thePQ.insert(1998);
      thePQ.insert(420);

      System.out.println( "Is heap full?: " + thePQ.isFull() );
      System.out.println( "Is heap empty?: " + thePQ.isEmpty() );

      System.out.print( "Items removed: " );
      while( !thePQ.isEmpty() ) {
         int item = thePQ.remove();
         System.out.print( item + " " );
      }
      System.out.println( "" );
      System.out.println( "Is heap empty?: " + thePQ.isEmpty() );

      System.out.println( "***** TESTING PriorityQ.java COMPLETE *****" );      

   } 
}

