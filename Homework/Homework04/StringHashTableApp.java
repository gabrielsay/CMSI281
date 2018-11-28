/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  File name     :  StringHashTableApp.java
 *  Purpose       :  To practice storing strings in a linear probe hash table
 *  @author       :  Lafore, Jordyn, Alvin, Gabe, Calvin Lesko
 *  Date written  :  2018-11-27
 *  Description   :  To use this program, the user must type "java StringHashTableApp" after compiling it
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ---------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2018-11-26  Jordyn        Initial Setup
 *  @version 1.0.1  2014-07-26  Calvin Lesko  
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.io.*;

class StringDataItem
{
	private String sData;
	public StringDataItem(String ss)
		{ sData = ss; }

	public String getKey()
		{ return sData; }
}

class StringHashTable
{
	private StringDataItem[] hashArray;
	private int arraySize;
	private StringDataItem nonItem;

	public StringHashTable(int size)
	{
		arraySize = size;
		hashArray = new StringDataItem[arraySize];
		nonItem = new StringDataItem("-");
		for(int i = 0; i < size; i++)
			hashArray[i] = new StringDataItem(nonItem.getKey());
	}

	public void displayTable()
	{
		System.out.print("Table: ");
		for(int j = 0; j < arraySize; j++)
		{
			if(hashArray[j] != null)
				System.out.print(hashArray[j].getKey() + " ");
			else
				System.out.print("** ");
		}
		System.out.println("");
	}

	public int hashFunc(String key)
	{
		int hashVal = 0;
		for(int j = 0; j<key.length(); j++)
		{
			int letter = key.charAt(j);
			hashVal = (hashVal * 27 + letter) % arraySize;
		}
		return hashVal;
	}

	public void insert(StringDataItem item)
	{

		String key = item.getKey();
		int hashVal = hashFunc(key);
		while(hashArray[hashVal].getKey() != "-")
		{
			++hashVal;
			hashVal %= arraySize;
		}
		hashArray[hashVal] = item;
	}

	public StringDataItem delete(String key)
	{
		int hashVal = hashFunc(key);

		while(hashArray[hashVal].getKey() != "-" && hashArray[hashVal].getKey() != null)
		{
			if(hashArray[hashVal].getKey().equals(key))
			{
				StringDataItem temp = hashArray[hashVal];
				hashArray[hashVal] = nonItem;
				return temp;
			}
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}

	public StringDataItem find(String key)
	{
		int hashVal = hashFunc(key);
		while(hashArray[hashVal].getKey() != "-" && hashArray[hashVal].getKey() != null)
		{
			if(hashArray[hashVal].getKey().equals(key))
				return hashArray[hashVal];
			++hashVal;
			hashVal %= arraySize;
		}
		return null;
	}
} //end StringHashTable class

class StringHashTableApp
{
	public static void main(String[] args) throws IOException
	{
		StringDataItem aDataItem;
		int size, n, keysPerCell;
		String aKey;

		System.out.print("Enter size of hash table: ");
		size = getInt();
		System.out.print("Enter initial number of items: ");
		n = getInt();
		keysPerCell = 10;

		StringHashTable theHashTable = new StringHashTable(size);

		for(int j=0; j<n; j++)
		{
			aKey = Double.toString((java.lang.Math.random() * keysPerCell * size));
			aDataItem = new StringDataItem(aKey);
			theHashTable.insert(aDataItem);
		}

		while(true)
		{
			System.out.print("Enter first letter of show, insert, delete, or find: ");
			char choice = getChar();
			switch(choice)
			{
			case 's':
				theHashTable.displayTable();
				break;
			case 'i':
				System.out.print("Enter string to insert: ");
				aKey = getString();
				aDataItem = new StringDataItem(aKey);
				theHashTable.insert(aDataItem);
				break;
			case 'd':
				System.out.print("Enter string to delete: ");
				aKey = getString();
				theHashTable.delete(aKey);
				break;
			case 'f':
				System.out.print("Enter string to find: ");
				aKey = getString();
				aDataItem = theHashTable.find(aKey);
				if(aDataItem != null)
					System.out.println("Found " + aKey);
				else
					System.out.println("Could not find " + aKey);
				break;
			default:
				System.out.println("Invalid entry!");
			}
		}
	}

	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	public static char getChar() throws IOException
	{
		String s = getString();
		return s.charAt(0);
	}

	public static int getInt() throws IOException
	{
		String s = getString();
		return Integer.parseInt(s);
	}
} // End HashTableApp
