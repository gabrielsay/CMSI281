/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  SourceFile.java
 *  Purpose       :  Practice of importing packages and having different classes perform
 *                   different tasks
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-05
 *  Description   :  The application looks for a file and places contents into a string.
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

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.FileReader;

 public class SourceFile{
   private String copiedFile = null;

   public SourceFile(String fileUpload) {
     try {
          BufferedReader cF = new BufferedReader (new FileReader (fileUpload));
          copiedFile = cF.readLine();
          cF.close();
     } catch (IOException ioe){
          System.out.println("File may not Exist :(");
     }
   }
   public String fileContent() {
     return copiedFile;
   }
 }
