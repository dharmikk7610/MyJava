import java.util.Scanner;

public class first5 {

	// Java Program To Check Whether Two Strings Are Anagram

	public static void main(String[] args) {

		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1:");
		String s1 = sc.nextLine();
		System.out.println("Enter a Stirng2");
		String s2 = sc.nextLine();

		if(s1.length()!=s2.length())
		{
			System.out.println("String are not Anagram");
		}
		else
		{
		for (int i = 0; i < s1.length(); i++) {
			for(int j=0;j<s2.length();j++)
			{
				
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
				}
			}
		}
		if(count==s1.length())
		{
			System.out.println(" Both String are Anagram");
		}
		else
		{
			System.out.println("both string are not Anagram");
		}
		}
	}
}
