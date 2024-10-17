package homework17_10;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1618488311588809379L;
	private String name;
	private String author;
	private int year;
	
	public Book(String _name, String _author, int _year)
	{
		name = _name;
		author = _author;
		year = _year;
	}
	
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
	
	public String getAuthor() { return this.author; }
	public void setAuthor(String author) { this.author = author; }
	
	public int getYear() { return this.year; }
	public void setYear(int year) { this.year = year; }
	
	@Override
	public String toString() 
	{
		return author + ":" + name + ", " + year;
	}
}
