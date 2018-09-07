/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  TargetFile.java
 *  Purpose       :  Practice of importing packages and having different classes perform
 *                   different tasks
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-05
 *  Description   :  The application takes string from SourceFile and copies it.
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  N/A
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-05  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 package copiersupport;

 import java.io.BufferedWriter;
 import java.io.IOException;
 import java.io.FileWriter;

 public class TargetFile{

   public TargetFile(String userFile, String newFile) {
     try{
       BufferedWriter nF = new BufferedWriter(new FileWriter(newFile));
       nF.write(userFile);
     } catch(IOException ioe){
       System.out.println("Could not find file :(");
     }
   }
 }
