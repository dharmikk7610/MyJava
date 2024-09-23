public class first3 {
	// Java Program to Count Vowels and Consonants in a String

	public static void main(String[] args) {
		int count = 0,d=0;
		String s = "dharmik";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c=='a' || c=='e'|| c=='i'||c=='o'||c=='u')
			{
				count++;
			}
			else {
				d++;
			}
		}
		System.out.println("vovels="+count);
		System.out.println("consenlt="+d);

	}

}
