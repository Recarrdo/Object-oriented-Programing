import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ½Ç½À3
{
	public static void main(String [] args)
	{
		String fileName = "numbers.dat";
		try
		{
			ObjectInputStream inputStream = 
					new ObjectInputStream(new FileInputStream(fileName));
			System.out.println("reading nonnegative integers.");
			System.out.println("In the file " + fileName);
			int anInteger = inputStream.readInt();
			while (true)
			{
				System.out.println(anInteger);
				anInteger = inputStream.readInt();
			}
	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Problem opening the file" + fileName);
		}
		catch(EOFException e)
		{
			System.out.println("Provlem reading the file " + fileName);
			System.out.println("Reached end of the file.");
		}
		catch(IOException e)
		{
			System.out.println("Problem with output to file" + fileName);
		}
		System.out.println("End of reading from file.");
	}
}
