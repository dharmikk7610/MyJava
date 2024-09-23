
public class Project1 {
	
	public static void main(String[] args) {
		String s1 = "madam";
		String s2 = "";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char a = s1.charAt(i);
			s2 = s2+a;
			
		}
		if(s1.equals(s2))
		{
			System.out.println("both string is equals..");
		}
		else
		{
			System.out.println("not same...");
		}
	}

}
