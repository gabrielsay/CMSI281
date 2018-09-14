/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  IntListInterface.java
 *  Purpose       :  To practice organizing all methods into an interface.
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-10
 *  Description   :  This implements an interface
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  None
 *  Exceptions    :  IllegalArgumentException when the input arguments are not allowed
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-13  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
public interface IntListInterface {
  int getValueAtIndex(int index);
  boolean append (int valueToAdd);
  boolean insertValueAtIndex( int value, int index );
  int removeValueAtIndex( int index );
  boolean checkIndex(int index);
  boolean prepend(int valueToAdd);
}
