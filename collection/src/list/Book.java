package list;

import java.util.Scanner;

public class Book {

	private int id ;
	private String name ;
	private String authorname ;
	private int price ;
	private int quantity ;
	
	public Book()
	{
		
	}
	
	public Book(int id, String name, String authorname, int price, int quantity) {
		
		this.id = id;
		this.name = name;
		this.authorname = authorname;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void addbook()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a book_id");
		 id = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter a book name:");
		 name  =  sc.nextLine();
		 System.out.println("Enter a Authorname:");
		 authorname = sc.nextLine();
		 System.out.println("Enter a book price:");
		 price = sc.nextInt();
		 System.out.println("Enter a book Quenty:");
		 quantity = sc.nextInt();
	}
	
	public void display() {
		System.out.println(id+" "+name+" "+authorname+" "+price+" "+quantity);
	}

	
	
}
