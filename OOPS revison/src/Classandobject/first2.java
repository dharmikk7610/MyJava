package Classandobject;

 abstract  class jack {
	
	abstract  void  marksheet();
}
 class  first2 extends jack{
	 
	 public void marksheet()
	 {
		 System.out.println("hello here..");
	 }
	 
	 public static void main(String[] args) {
		first2 j = new first2();
		j.marksheet();
	}
 }
