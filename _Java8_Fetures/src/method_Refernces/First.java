package method_Refernces;

@FunctionalInterface
interface java{
	 void myinfo();
}
class java2{
	public static void mainfo1(){
		System.out.println("my name is javaguru");
	}
}

public class First extends java2  {

	public static void main(String[] args) {
		java j = ()->{
			System.out.println("hello interfaceguru");
		};
		j.myinfo();
		
		java j2 = java2::mainfo1; // Assigning the static method reference to the functional interface
        j2.myinfo();
        
		
	}
	
	
}
