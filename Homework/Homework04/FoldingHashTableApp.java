/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  FoldingHashTableApp.java
 *  Purpose       :  To practice storing strings in a folding hash table
 *  @author       :  Lafore, Jordyn, Alvin, Gabe, Calvin Lesko
 *  Date written  :  2018-11-27
 *  Description   :  To use this program, the user must type "java FoldingHashTableApp" after compiling it
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-11-26  Jordyn        Initial Setup
 *  @version 1.0.1  2014-07-26  Calvin Lesko  
 *  @version 1.0.2  2018-11-28  Alvin         Fixed formatting
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.io.*;

class FoldingHashTable {
   private HashDataItem[] hashArray;
   private int arraySize;
   private HashDataItem nonItem;
   
   public FoldingHashTable( int size ) {
      arraySize = size;
      hashArray = new HashDataItem[arraySize];
      nonItem = new HashDataItem( -1 ); 
   }
   
   public void displayTable() {
      System.out.print( "Table: " );
      for( int j = 0; j < arraySize; j++ ) {
         if( hashArray[j] != null ) {
            System.out.print( hashArray[j].getKey() + " " );
         } else {
            System.out.print( "** " );
         }
      }
      System.out.println( "" );
   }
   
//folds key into groups and adds them
   public int hashFunc( int key ) {
      int groupSize = 1;
      int temp = arraySize;
      int hashVal = 0;
      
      while( temp > 0 ) {
         temp /= 10;
         groupSize *= 10;
      }
      
      while( key > 0 ) {
         hashVal += key % groupSize;
         key /= groupSize;
      }
      return hashVal;
   }
   
   public void insert( HashDataItem item ) {
      int key = item.getKey();
      int hashVal = hashFunc( key );
      while( hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1 ) {
         ++hashVal;
         hashVal %= arraySize;
      }
      hashArray[hashVal] = item;
   }
   
   public HashDataItem delete( int key ) {
      int hashVal = hashFunc( key );
      
      while( hashArray[hashVal] != null ) {
         if(hashArray[hashVal].getKey() == key) {
            HashDataItem temp = hashArray[hashVal];
            hashArray[hashVal] = nonItem;
            return temp;
         }
         ++hashVal;
         hashVal %= arraySize;
      }
      return null;
   }
   
   public HashDataItem find( int key ) {
      int hashVal = hashFunc( key );
      while( hashArray[hashVal] != null ) {
         if( hashArray[hashVal].getKey() == key ) {
            return hashArray[hashVal];
         }
         ++hashVal;
         hashVal %= arraySize;
      }
      return null;
   }
} //end HashTable class

class FoldingHashTableApp {
   public static void main( String[] args ) throws IOException {
      HashDataItem aDataItem;
      int aKey, size, n, keysPerCell;
      
      System.out.print( "Enter size of hash table: " );
      size = getInt();
      System.out.print( "Enter initial number of items: " );
      n = getInt();
      keysPerCell = 10;
      
      HashTable theHashTable = new HashTable( size );
      
      for( int j = 0; j < n; j++ ) {
         aKey = (int)( java.lang.Math.random() * keysPerCell * size );
         aDataItem = new HashDataItem( aKey );
         theHashTable.insert( aDataItem );
      }
      
      while( true ) {
         System.out.print( "Enter first letter of show, insert, delete, or find: " );
         char choice = getChar();
         switch( choice ) {
         case 'w':
            theHashTable.displayTable();
            break;
         case 'x':
            System.out.print( "Enter key value to insert: " );
            aKey = getInt();
            aDataItem = new HashDataItem( aKey );
            theHashTable.insert( aDataItem );
            break;
         case 'y':
            System.out.print( "Enter key value to delete: " );
            aKey = getInt();
            theHashTable.delete( aKey );
            break;
         case 'z':
            System.out.print( "Enter key value to find: " );
            aKey = getInt();
            aDataItem = theHashTable.find( aKey );
            if( aDataItem != null ) {
               System.out.println( "Found " + aKey);
            } else {
               System.out.println( "Could not find " + aKey );
            }
            break;
         default:
            System.out.println( "Invalid entry!" );
         }
      }
   }
   
   public static String getString() throws IOException {
      InputStreamReader isr = new InputStreamReader( System.in );
      BufferedReader br = new BufferedReader( isr );
      String s = br.readLine();
      return s;
   }
   
   public static char getChar() throws IOException {
      String s = getString();
      return s.charAt(0);
   }
   
   public static int getInt() throws IOException {
      String s = getString();
      return Integer.parseInt(s);
   }
} //end HashTableApp 
