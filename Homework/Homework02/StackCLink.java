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
     myCStack.display();
   }

   public static void main(String[] args){
     StackCLink testStack = new StackCLink();

     System.out.println("\n --------Test Push()--------\n");
     testStack.push(12);
     testStack.peek();
     testStack.push(4);
     testStack.peek();
     testStack.push(51);
     testStack.peek();

     System.out.println("\n --------Test Pop() and Peek()--------\n");
     testStack.pop();
     testStack.peek();
     testStack.pop();
     testStack.peek();
     testStack.pop();
     testStack.peek();

     System.out.println("\n --------Final Test--------\n");
     testStack.push(356);
     testStack.push(81);
     testStack.pop();
     testStack.push(12);
     testStack.push(912);
     testStack.push(123);
     testStack.peek();
     testStack.pop();
     testStack.peek();
     testStack.pop();
     testStack.peek();
   }
}
