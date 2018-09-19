/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  HighArrayApp.java
 *  Purpose       :  Continued practice with using arrays
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-16
 *  Description   :  Testing out getMax() method and noDups() method.
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-15  Gabriel Say   Initial set up
 *  @version 1.0.1  2018-09-18  Gabriel Say   Added tests for noDups() and getMax()
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
class HighArrayApp {

     public static void main(String[] args) {
       int maxSize = 100;
       HighArray arr;
       arr = new HighArray(maxSize);

       arr.insert(77);
       arr.insert(44);
       arr.insert(55);
       arr.insert(22);
       arr.insert(88);
       arr.insert(11);
       arr.insert(00);
       arr.insert(66);
       arr.insert(33);

       System.out.println("\n Printing out Array: \n");

       arr.display();

       int searchKey = 35;
       if (arr.find(searchKey))
       System.out.println("Found " + searchKey);

       arr.insert(00);
       arr.insert(55);
       arr.insert(99);

       arr.display();

       System.out.println("\n Looking for max values in array: \n");

       System.out.println("\nTest 1: \n");
       arr.display();
       System.out.println(arr.getMax() + (arr.getMax() == 99 ? " Correct max value!" : " Ehh, I messed up. Sorry!")); //Should return correct
       System.out.println("\nTest 2: \n");
       arr.delete(99);
       arr.display();
       System.out.println(arr.getMax() + (arr.getMax() == 88 ? " Correct max value!" : " Ehh, I messed up. Sorry!")); //Should return correct
       System.out.println("\nTest 3: \n");
       arr.insert(92);
       arr.display();
       System.out.println(arr.getMax() + (arr.getMax() == 92 ? " Correct max value!" : " Ehh, I messed up. Sorry!")); //Should return correct
       System.out.println("\nTest 4: \n");
       arr.delete(92);
       arr.delete(88);
       arr.insert(169);
       arr.display();
       System.out.println(arr.getMax() + (arr.getMax() == 169 ? " Correct max value!" : " Ehh, I messed up. Sorry!")); //Should return correct
       System.out.println("\nTest 5: \n");
       arr.delete(169);
       arr.display();
       System.out.println(arr.getMax() + (arr.getMax() == 169 ? " Correct max value!" : " Ehh, I messed up. Sorry!")); //Should return "I messed up..."
       System.out.println("\nTest 6: \n");
       arr.insert(1052);
       arr.insert(4020);
       arr.delete(66);
       arr.insert(2);
       arr.insert(20480);
       arr.display();
       System.out.println(arr.getMax() + (arr.getMax() == 20480 ? " Correct max value!" : " Ehh, I messed up. Sorry!")); //Should return correct

       System.out.println("\nTesting noDupes: \n");

       System.out.println("Adding duplicates to remove!");
       arr.insert(23);
       arr.insert(67);
       arr.insert(23);
       arr.insert(67);
       System.out.println("\nArray before removal of duplicates:\n");
       arr.display();
       System.out.println("\nRemoving dupiclates...\n");
       arr.noDups();
       arr.noDups(); //needs to be done twice because the deletion only runs through once
       arr.display();
     }
   }
