
public class first4 {
	// Java Program to Find Duplicate Characters in a String

	public static void main(String[] args) {
		String s = "dharmdik";
		int count=0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j >=0; j--) {
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					if(count>=2)
					{
						System.out.println("duplicate character ="+s.charAt(i));
					}
					
				}
			}
			count=0;
		}
		System.out.println("no duplicate character");
	}

}
