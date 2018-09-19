/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArray.java
 *  Purpose       :  To get some practice with using class interfaces and working with arrays
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-16
 *  Description   :  After copying the code over from Lafore (pg.49-50), I implemented
 *                   a getMax() class and noDups(). getMax() looks for the highest value in the
 *                   array and returns it while noDups() prevents duplicate values from being in
 *                   the array.
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-15  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
//import java.util.Scanner;
import java.util.Arrays;

class HighArray
{
  private long[] a;                  // ref to array a
  private int nElems;                // number of data items
  //Scanner Ar = new Scanner(System.in);
  //-----------------------------------------------------------
  public HighArray(int max){         // constructor
    a = new long[max];               // create the array
    nElems = 0;                      // no items yet
  }
  //-----------------------------------------------------------
  public boolean find (long searchKey)  { //find specified value
    int j;
    for (j=0; j<nElems; j++)         // for each element
      if(a[j] == searchKey)          // found item?
      break;                         // exit loop before end
    if(j == nElems)                  // gone to end?
    return false;                    // yes, can't find it
    else
    return true;                     // no, found it
  }                                  // end, find()
  //-----------------------------------------------------------
  public void insert(long value) {   // put element into array
    a[nElems] = value;               // insert it
    nElems++;                        // increment size
  }
  //-----------------------------------------------------------
  public boolean delete(long value){
    int j;
    for(j=0; j<nElems; j++)          // look for it
      if(value == a[j])
         break;
      if(j==nElems)                  // can't find it
         return false;
      else {                         // found it
        for(int k=j; k<nElems; k++)  // move higher ones down
           a[k] = a[k+1];
        nElems--;                    // decrement size
        return true;
      }
  } //end delete()
  //-----------------------------------------------------------
  public void display() {            // displays array contents
    for (int j=0; j<nElems; j++)     // for each element
      System.out.print(a[j] + " ");  // display it
      System.out.println("");
  }
  //-----------------------------------------------------------
  public long getMax(){
    /**public static int getMax(int[] array){
       int maxValue = array[0];
          for (int i = 0; i < array.length; i++)
  }**/
    long maxValue = 0;
    if (nElems != 0){
      for (int i = 0; i < nElems; i++){
        if(a[i] > maxValue){
          maxValue = a[i];
        }
      } return maxValue;
    } else {
      return -1;
    }
  }
  //-----------------------------------------------------------
  public void noDups(){
    for (int j = 0; j < nElems; j++){
      for (int k = j + 1; k < nElems; k++){
        if (a[j] == a[k]){
          delete(a[k]);
        }
      }
    }
  }
}  //end class HighArray
///////////////////////////////////////////////////////////////
