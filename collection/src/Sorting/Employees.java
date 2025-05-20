package Sorting;

public class Employees implements Comparable<Employees> {
	private int id ; 
	private String name ; 
	private int age  ;
	
	public Employees(){
		
	}
	
	public Employees(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	public int compareTo(Employees e)
	{
		if(id > e.id)
		{
			return 1 ;
		}
		else if (id<e.id) {
			return -1;
		}
		else {
			return 0 ;
		}
		
	}
	
	

}
