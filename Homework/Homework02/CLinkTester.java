/*
 * A series of tests for CircularLinkedListTester.java
 */

public class CLinkTester {
   public static void main( String[] args ) {

      System.out.println( " " );
      System.out.println( "***** TESTING CLink.java *****");
      System.out.println( " " );

      CLinkedList myList = new CLinkedList();

      myList.insert(10);
      myList.insert(20);
      myList.insert(30);
      myList.insert(40);
      myList.insert(50);
      myList.insert(60);
      myList.insert(70);
      myList.insert(80);
      myList.insert(90);
      myList.insert(100);

      myList.display();
      System.out.println( "---------------------------------------" );
      System.out.println( "Deleting items..." );
      myList.delete();
      myList.delete();
      myList.delete();

      myList.display();
      System.out.println( "---------------------------------------" );
      System.out.println( "Item at index 1: " + myList.find(10) );
      System.out.println( "Item at index 2: " + myList.find(20) );
      System.out.println( "Item at index 3: " + myList.find(30) );
      System.out.println( "Item at index 4: " + myList.find(40) );
      System.out.println( "Item at index 5: " + myList.find(50) );
      System.out.println( "Item at index 6: " + myList.find(60) );
      System.out.println( "Item at index 7: " + myList.find(70) );
      System.out.println( "Item at index 5: " + myList.find(80) );
      System.out.println( "Item at index 6: " + myList.find(90) );
      System.out.println( "Item at index 7: " + myList.find(100) );
      System.out.println( "---------------------------------------" );
      // System.out.println( "Item at index 8: " + myList.find(8) ); // should display item at index 0

      System.out.println( "Deleting items..." );
      myList.delete();
      myList.delete();
      myList.display();

      System.out.println( "*****TESTING COMPLETE*****" );
   }
}
