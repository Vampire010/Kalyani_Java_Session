package Coll_ArrayList_Ex;

import java.util.ArrayList;

public class Books_ex1 
{

	public static void main(String[] args) 
	{

		ArrayList<String> books= new ArrayList<>();
		// add elements to an ArrayList
		books.add("C");
		books.add("C++");
		books.add("Java");
		books.add("Python");

		//Access an element in 	ArrayList
		System.out.println("Book Name is: " + books.get(0));
		
		System.out.println("Books ArrayList Before Update: " + books);

		
		//update the  value
		books.set(0, "Javascript");
		System.out.println("Books ArrayList After Update: " + books);
		
		//Remove ArrayList Elements
		books.remove(1);
		System.out.println("Books ArrayList After Removing C++: " + books);

		
		//size() Returns the length of the arraylist.
		int books_size = books.size();
		System.out.println("Tootal Number of Books in ArayList Colletion are : " + books_size);
		
		//contains() Searches the arraylist for the specified element and returns a boolean result.
		boolean search_ele = books.contains("Javascript");
		System.out.println("Is the Book availble in the ArrayList: " + search_ele);	
		
		
		//isEmpty() check collection is Empty or Not
		boolean is_Books_empty = books.isEmpty();
		System.out.println("Is the Book ArrayList is Empty: " + is_Books_empty);	
		
		System.out.println("Availble books are: " );	

		for(String coll_books: books)
		{
			System.out.print( coll_books +" ,");

		}
		
		
	}

}
