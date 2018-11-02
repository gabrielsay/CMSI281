/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  oddEvenSort.java
 *  Purpose       :  To practice using sorting systems and sorting by using the odd-even method
 *  @author       :  Jordyn, Alvin, Gabe
 *  Date written  :  2018-10-28
 *  Description   :  To use this program, the user must type "java OddEvenSortApp." This will then
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-10-28  Gabe Say        Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class ArrayOddEven {
   private long[] a;                        // ref to array a
   private int nElems;                      // number of data items
//--------------------------------------------------------------
   public ArrayOddEven(int max) {
      a = new long[max];
      nElems = 0;
   }
//--------------------------------------------------------------
   public void insert(long value) {
      a[nElems] = value;
      nElems++;
   }
//--------------------------------------------------------------
   public void display() {
      for(int j=0; j<nElems; j++)
         System.out.print(a[j] + " ");
      System.out.println("");
   }
//--------------------------------------------------------------
   public void oddEvenSort() {
      int out, in;
      for(out=nElems-1; out>1; out--)
         for(in=0; in<out; in++)
            if( a[in] > a[in+1] )
               swap(in, in+1);
   }
//--------------------------------------------------------------
   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
}
//--------------------------------------------------------------
class OddEvenSortApp {
   public static void main(String[] args) {
      int maxSize = 100;
      ArrayOddEven arr;
      arr = new ArrayOddEven(maxSize);

      arr.insert(77);
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);

      arr.display();

      arr.oddEvenSort();
      arr.display();
   }
}
