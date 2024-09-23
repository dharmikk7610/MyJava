package _1_By_extending.Threadtopic;

public class First {

	public static void main(String[] args) {
		
		Table resourse = new Table();
		
		Mytable t1 = new Mytable(resourse);
		Mytable t2 = new Mytable(resourse);
		Mytable t3 = new Mytable(resourse);
		Mytable t4 = new Mytable(resourse);
		Mytable t5 = new Mytable(resourse);
		

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}
