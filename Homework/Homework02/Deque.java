/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  Deque.java
 *  Purpose       :  To practice working with Nodes
 *  @author       :  Jordyn, Gabe, Alvin
 *  Date written  :  2018-10-15
 *  Description   :  This implements the insertLeft(), insertRight(), removeLeft(),
 *                   removeRight(), isEmpty(), and isFull()methods
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-10-15  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 import java.io.*;

public class Deque {
   private int nItems;
   private int maxSize;
   private long[] arr;

   private int left;
   private int right;

   public Deque(int d) {
      maxSize = d;
      arr = new long[maxSize];
      nItems = 0;
      left = 0;
      right = -1;
   }
//--------------------------------------------------------------
   public boolean isFull() {     //return true if not full
     return (nItems == maxSize);
   }
//--------------------------------------------------------------
   public void insertLeft(long value) {
    if (isFull()) {
       System.out.println("Deque is full!");
    } else if (left == 0) {
      arr[maxSize - 1] = value;
      left = maxSize;
     } else {
       arr[--left] = value;
       nItems++;
     }
   }
//--------------------------------------------------------------
   public long removeLeft() {
     long front = arr[left];
     if (isEmpty()) {
       System.out.println("Deque is empty!");
       return -1;
     } else {
      left++;
         if(left >= maxSize)
        left = 0;
            nItems--;
        return front;
     }
   }
//--------------------------------------------------------------
   public void insertRight(long val) {
     if(isFull()) {
       System.out.println("Deque is full!");
     } if (right == maxSize - 1) {
       arr[0] = val;
       right = 0;
     } else {
       arr[++right] = val;
       nItems++;
     }
   }
//--------------------------------------------------------------
   public long removeRight() {
     long rear = arr[right];
     if (isEmpty()) {
       System.out.println("Deque is empty!");
       return -1;
     } else {
       right--;
       if(right < 0)
        right = maxSize -1;
        nItems--;
        return rear;
     }
   }
//--------------------------------------------------------------
   public boolean isEmpty() {
     return (nItems == 0);
   }
//--------------------------------------------------------------
   public void display() {
     int index = left;
     for (int i = 0; i < nItems; i++) {
       System.out.println(arr[index] + " ");
       if (index == maxSize - 1){
         index = 0;
       } else {
         index++;
       }
     } System.out.println();
   }
//--------------------------------------------------------------
}
