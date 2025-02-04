
public class first2 {
	// Java Program to Find the First Non-repeated Character in a String

	public static void main(String[] args) {
		String s = "dharmik";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j >= 0; j--) {
				if (s.charAt(i) != s.charAt(j)) {
					count++;
					if (count == s.length()) {
						System.out.println(s.charAt(i));
					}
				}
			}
		}
	}
}
