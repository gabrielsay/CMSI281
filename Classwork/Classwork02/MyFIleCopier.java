/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  MyFileCopier.java
 *  Purpose       :  Practice of importing packages and having different classes perform
 *                   different tasks
 *  @author       :  Gabe Say
 *  Date written  :  2018-09-05
 *  Description   :  The application asks for a file then pulls it up and makes a copy of it.
 *  Notes         :  None right now.  I'll add some as they occur.
 *  Warnings      :  N/A
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-09-05  Gabriel Say   Initial set up
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
 import copiersupport.SourceFile;
 import copiersupport.TargetFile;
 import java.util.Scanner;

public class MyFileCopier{
     public static void main(String args[]) {
          System.out.println("Please input the name of desired file to be copied");
          Scanner urInput = new Scanner(System.in);
          String fileInputName = urInput.nextLine();
          SourceFile requestedFile = new SourceFile(fileInputName);
          TargetFile copiedFile = new TargetFile(requestedFile.fileContent(), fileInputName + ".copy");
     }
}
