/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  InOrderTree.java
 *  Purpose       :  To practice putting a tree in order from left to right
 *  @author       :  Lafore, Jordyn, Alvin, Gabe
 *  Date written  :  2018-10-28
 *  Description   :  To use this program, the user must type "java InOrderTreeApp"
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-11-26  Lafore        Initial set up from the book
 *  @version 1.0.1  2018-11-27  Gabriel Say   Testing and edits/org to make program function properly
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.io.*;
import java.util.*;

class Node
   {
   int iData;
   double dData;
   Node leftChild;
   Node rightChild;

   public void displayNode()
      {
      }
   }
class InOrderTree
   {
   private Node root;

   public InOrderTree(){
     root = null;
   }

   public Node find(int key)
      {
      Node current = root;
      while(current.iData != key)
         {
         if(key < current.iData)
            {
            current = current.leftChild;
            }
         else
            {
            current = current.rightChild;
            }
         if(current == null)
            {
            return null;
            }
         }
         return current;
      }

   public void insert(int id)
      {
      Node newNode = new Node();
      newNode.iData = id;
      if(root==null)
         {
         root = newNode;
         }
      else
         {
         Node current = root;
         Node parent;
         while(true)
            {
               parent = current;
               if(id < current.iData)
                  {
                  current = current.leftChild;
                  if(current == null)
                     {
                      parent.leftChild = newNode;
                      return;
                    }
                  }
                else
                  {
                  current = current.rightChild;
                  if(current == null)
                     {
                      parent.rightChild = newNode;
                      return;
                    }
                  }
            }
          }
        }
   public boolean delete(int key)
      {
      Node current = root;
      Node parent = root;
      boolean isLeftChild = true;
      while(current.iData != key)
         {
         parent = current;
         if(key < current.iData)
            {
            isLeftChild = true;
            current = current.leftChild;
            }
         else
            {
            isLeftChild = false;
            current = current.rightChild;
            }
            if(current == null)
            return false;
          }
          if(current.leftChild==null && current.rightChild == null)
             {
             if(current == root)
                root = null;
             else if(isLeftChild)
                parent.leftChild = null;
             else
                parent.rightChild = null;
             }
          else if(current.rightChild==null)
             if(current == root)
                root = current.leftChild;
             else if(isLeftChild)
                parent.leftChild = current.leftChild;
             else
                parent.rightChild = current.leftChild;
          else if(current.leftChild==null)
             if(current == root)
                root = current.rightChild;
             else if(isLeftChild)
                parent.leftChild = current.rightChild;
             else
                parent.rightChild = current.rightChild;
          else
             {
             Node successor = getSuccessor(current);
             if(current == root)
                root = successor;
             else if(isLeftChild)
                parent.leftChild = successor;
             else
                parent.rightChild = successor;
             successor.leftChild = current.leftChild;
             }
             return true;
      }

     public void inOrder(Node localRoot)
        {
           if(localRoot != null)
              {
              inOrder(localRoot.leftChild);

              System.out.print(localRoot.iData + " ");
              inOrder(localRoot.rightChild);
              }
        }
     public void inOrder()
        {
        if(root != null)
           {
           inOrder(root.leftChild);

           System.out.print(root.iData + " ");
           inOrder(root.rightChild);
           }
        }

   private Node getSuccessor(Node delNode)
      {
      Node successorParent = delNode;
      Node successor = delNode;
      Node current = delNode.rightChild;
      while(current != null)
         {
         successorParent = successor;
         successor = current;
         current = current.leftChild;
         }
      if(successor != delNode.rightChild)
         {
         successorParent.leftChild = successor.rightChild;
         successor.rightChild = delNode.rightChild;
         }
      return successor;
      }

   public void displayTree()
      {
      Stack<Node> globalStack = new Stack<Node> ();
      globalStack.push(root);
      int nBlanks = 32;
      boolean isRowEmpty = false;
      System.out.println(
      "\n......................................................\n");
      while(isRowEmpty == false)
         {
         Stack<Node> localStack = new Stack<Node> ();
         isRowEmpty = true;

         for(int j = 0; j<nBlanks; j++)
            System.out.print(' ');

         while(globalStack.isEmpty() == false)
            {
            Node temp = globalStack.pop();
            if(temp != null)
               {
               System.out.print(temp.iData);
               localStack.push(temp.leftChild);
               localStack.push(temp.rightChild);

               if(temp.leftChild != null || temp.rightChild != null)
                  isRowEmpty = false;
               }
            else
               {
                 System.out.print("--");
                 localStack.push(null);
                 localStack.push(null);
               }
            for(int j = 0; j<nBlanks*2-2; j++);
               System.out.print(' ');
            }
         System.out.println();
         nBlanks /= 2;
         while(localStack.isEmpty() == false)
            globalStack.push(localStack.pop());
         }
      System.out.println(
      "\n......................................................\n");
      }
}
class InOrderTreeApp {
     public static void main(String[] args) {
       InOrderTree test = new InOrderTree();

       test.insert(18);
       test.insert(1);
       test.insert(12);
       test.insert(143);
       test.insert(51);
       test.insert(202);

       test.displayTree();
       test.inOrder();
       test.displayTree();

       test.delete(12);
       test.displayTree();

       test.insert(123);
       test.insert(93);
       test.insert(42);
       test.insert(6);
       test.delete(202);
       test.displayTree();
     }
   }
