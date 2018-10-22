/*
 * A series of tests for Stack.java
 */

public class StackTester {
   public static void main( String[] args ) {
      Stack myStack = new Stack();

      System.out.println( "isEmpty() result: " + myStack.isEmpty() );

      System.out.println( "Pushing values..." );
      myStack.push(50);
      myStack.push(40);
      myStack.push(30);
      myStack.push(20);
      myStack.push(10);

      System.out.println( "Displaying stack..." );
      //myStack.display();
      System.out.println( "peek() result: " + myStack.peek() );
      System.out.println( "getSize() result: " + myStack.getSize() );

      System.out.println( "Popping values..." );
      myStack.pop();
      myStack.pop();
      myStack.pop();
      myStack.pop();
      
      System.out.println( "isEmpty() result: " + myStack.isEmpty() );
      System.out.println( "Displaying stack..." );
      //myStack.display();
      System.out.println( "peek() result: " + myStack.peek() );
      System.out.println( "getSize() result: " + myStack.getSize() );

      myStack.pop();
      System.out.println( "isEmpty() result: " + myStack.isEmpty() );
      System.out.println( "Displaying stack..." );
      //myStack.display();
      System.out.println( "peek() result: " + myStack.peek() );
      System.out.println( "getSize() result: " + myStack.getSize() );

      System.out.println( "***** TESTING COMPLETE *****");   

   }
}
