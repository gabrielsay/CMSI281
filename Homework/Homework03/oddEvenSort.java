/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  oddEvenSort.java
 *  Purpose       :  To practice using sorting systems and sorting by using the odd-even sort method
 *  @author       :  Jordyn, Alvin, Gabe
 *  Date written  :  2018-10-28
 *  Description   :  To use this program, the user must type "java OddEvenSortApp"
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-10-28  Gabe Say      Initial set up
 *  @version 1.0.1  2018-11-04  Gabe Say      Added if() to oddEvenSort to avoid using odd when not enough
 *                                            nElems
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
     int odd, even;
     for(int i = 0; i < nElems; i++){
     //boolean sorted = false;
     //while(!sorted){
       //sorted = true;
       for(odd = 1; odd < nElems; odd += 2){
         if(nElems > 3)
         if(a[odd] > a[odd + 1]){
         swap(odd, odd + 1);
         //sorted = false;
       }
     }
     for(even = 0; even < nElems; even += 2){
       if(a[even] > a[even + 1]){
         swap(even, even + 1);
         //sorted = false;
       }
     }
    }
   }
//--------------------------------------------------------------
   private void swap(int one, int two) {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
}
//--------------------------------------------------------------
class oddEvenSortApp {
   public static void main(String[] args) {
     System.out.println("\n-------Test 1-------\n");
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

      System.out.println("\n-------Test 2-------\n");
      ArrayOddEven arr2 = new ArrayOddEven(31);

      arr2.insert(124);
      arr2.insert(21);
      arr2.insert(02);
      arr2.insert(524);
      arr2.insert(213);
      arr2.insert(69);
      arr2.insert(25);
      arr2.insert(00);
      arr2.insert(01);

      arr2.display();

      arr2.oddEvenSort();
      arr2.display();

      System.out.println("\n-------Test 3-------");
      //test to make sure oddEvenSort works when less than 3 nElems
      ArrayOddEven arrF = new ArrayOddEven(2);
      arrF.insert(35);
      arrF.insert(07);

      arrF.display();

      arrF.oddEvenSort();
      arrF.display();

      System.out.println("\n-------Test 4-------"); //already sorted
      ArrayOddEven finalTest = new ArrayOddEven(11);
      finalTest.insert(0);
      finalTest.insert(01);
      finalTest.insert(02);
      finalTest.insert(03);
      finalTest.insert(04);
      finalTest.insert(05);
      finalTest.insert(06);
      finalTest.insert(07);
      finalTest.insert(8);
      finalTest.insert(9);

      finalTest.display();

      finalTest.oddEvenSort();
      finalTest.display();
   }
}
