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
      System.out.println( "Finding value 10: " + myList.find(10) );
      System.out.println( "Finding value 20: " + myList.find(20) );
      System.out.println( "Finding value 30: " + myList.find(30) );
      System.out.println( "Finding value 40: " + myList.find(40) );
      System.out.println( "Finding value 50: " + myList.find(50) );
      System.out.println( "Finding value 60: " + myList.find(60) );
      System.out.println( "Finding value 70: " + myList.find(70) );
      System.out.println( "Finding value 80: " + myList.find(80) );
      System.out.println( "Finding value 90: " + myList.find(90) );
      System.out.println( "Finding value 100: " + myList.find(100) );
      System.out.println( "---------------------------------------" );
      // System.out.println( "Item at index 8: " + myList.find(8) ); // should display item at index 0

      System.out.println( "Deleting items..." );
      myList.delete();
      myList.delete();
      myList.display();

      System.out.println( "*****TESTING COMPLETE*****" );
   }
}
