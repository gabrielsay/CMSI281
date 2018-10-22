/*
 * A series of tests for Deque.java
 */

public class DequeTester {
    public static void main(String args[]) {
      Deque testDeque = new Deque(10);

      System.out.println("\n---Testing insertLeft() and removeLeft()---\n");
      System.out.println("Inserting in left...\n");

      testDeque.insertLeft(6);
      testDeque.insertLeft(18);
      testDeque.insertLeft(27);
      testDeque.display();

      System.out.println("Removing from left...\n");

      testDeque.removeLeft();
      testDeque.display();
      testDeque.removeLeft();
      testDeque.display();

      testDeque.insertLeft(41);
      testDeque.insertLeft(2);
      testDeque.insertLeft(37);
      testDeque.insertLeft(21);
      testDeque.insertLeft(196);
      System.out.println("Left- \n");
      testDeque.display();
      System.out.println("-Right");

      System.out.println("\n---Testing insertRight() and removeRight()---\n");
      System.out.println("Inserting in right...\n");

      testDeque.insertRight(32);
      testDeque.insertRight(8);
      testDeque.insertRight(93);
      System.out.println("Left- \n");
      testDeque.display();
      System.out.println("-Right");

      System.out.println("\nRemoving from right...\n");

      testDeque.removeRight();
      testDeque.removeRight();
      testDeque.display();

      testDeque.insertRight(234);
      testDeque.insertRight(3);
      testDeque.insertRight(29);
      testDeque.insertRight(12);
      testDeque.insertRight(31);
      System.out.println("Left- \n");
      testDeque.display();
      System.out.println("-Right");

    }
}
