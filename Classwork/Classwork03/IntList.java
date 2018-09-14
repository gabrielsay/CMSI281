/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntList.java
 *  Purpose       :  To practice using interfaces and working with arrays
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-10
 *  Description   :  This implements the insertValueAtIndex() method, checkIndex() method, and
 *                   the prepend() method into the original code from the class website.
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-10  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public class IntList implements IntListInterface {
    private int[] theList;
    private int   size;
    private int[]  nList;

    private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

    public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
       theList = new int[STARTING_SIZE];
       size = 0;
    }

    public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
       if( size == 0 ) {
          throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
       } else if( index > size ) {
          throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
       } else if( index < 0 ) {
          throw new ArrayIndexOutOfBoundsException( "The index value is too small");
       } else {
          return theList[index];
       }
    }

    public boolean append( int valueToAdd ) {
       if( size < theList.length ) {
          theList[size] = valueToAdd;
          size++;
          return true;
       } else {
          // what should we do here, if there's no room?
       }
       return false;
    }

    // we've gotta have this to actually get things to compile
    public boolean insertValueAtIndex( int value, int index ) {
      if( index >= theList.length ) {
         nList = new int [size + STARTING_SIZE];
         for( int i = 0; i < size; i++ ) {
            nList[i] = theList[i];
         }
         theList = nList;
      }
      for( int k = size; k > index; k-- ) {
         theList[k] = theList[k-1];
      }
      theList[index] = value;
      size++;
      return true;
    }

    public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
       if( size == 0 ) {
          throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
       } else if( index > size ) {
          throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
       } else if( index < 0 ) {
          throw new ArrayIndexOutOfBoundsException( "The index value is too small");
       } else {
          holeFiller( index );
       }
       int value = theList[index];
       return value;
    }

    private void holeFiller( int index ) {
       for( int i = index; i < size - 1; i++ ) {
          theList[i] = theList[i+1];
       }
       size--;
    }

    public boolean checkIndex(int index) {
      if(index >= theList.length) {
        return false;
      } else if (index <0) {
        return false;
      } else{
        return true;
      }
    }
    public boolean prepend(int valueToAdd) {
       insertValueAtIndex(valueToAdd, 0);
       return true;
    }
    public static void main( String[] args ) {
       IntList list = new IntList();
       list.append( 2 );
       list.append( 3 );
       list.append( 5 );
       list.append( 7 );
       System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
       list.append( 11 );
       System.out.println(list.insertValueAtIndex(11,18));   //should return true
       list.append( 13 );
       list.append( 17 );
       list.append( 19 );
       System.out.println(list.insertValueAtIndex(10,21));   // should return true
       System.out.println(list.prepend(18));                 // should return true
       System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
       System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
       System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
       System.out.println(list.theList);
       System.out.println( list.getValueAtIndex( 18 ) );     // just to see what happens

    }
 }
