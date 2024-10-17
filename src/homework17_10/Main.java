package homework17_10;

import java.io.*;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] args)
	{
		Book[] books = { new Book("Jedi technics", "Andrey A.", 2010), new Book("Clean code", "Robert M.", 2012) };
		try
		{
			FileOutputStream fos = new FileOutputStream("books.json");
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(books);
			fos.close();
			oos.close();
			System.out.println("Serialized array!");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			FileInputStream fis = new FileInputStream("books.json");
			ObjectInputStream ois = new ObjectInputStream (fis);
			Book[] deserialized_books = (Book[]) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Deserialized data - ");
			   for (Book book : deserialized_books) {
	                System.out.println(book);
	            }
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
