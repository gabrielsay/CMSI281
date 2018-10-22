/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  StackCLink.java
 *  Purpose       :  To practice working with Circular Linked Lists
 *  @author       :  Jordyn, Alvin, Gabe
 *  Date written  :  2018-10-18
 *  Description   :  This implements the CLink and CLinkedList to imitate a stack.
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-10-20  Gabe Say        Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class StackCLink {

   CLinkedList myCStack;
   int lastItem;

   public StackCLink() {
      myCStack = new CLinkedList();
   }

   public void push(int p) {
     myCStack.insert(p);
     lastItem = p;
   }

   public void pop() {
     //int delItem = lastItem;
     myCStack.delete();
   }

   public void peek() {
     myCStack.getItems();
   }

   public static void main(String[] args){
     StackCLink testStack = new StackCLink();

     System.out.println("\n --------Test 1--------\n");
     testStack.push(12);
     testStack.push(4);
     testStack.push(51);
   }
}
