package guess_no;

import java.math.*;
import java.util.Random;
import java.util.Scanner;

public class First {

	// int x = Random();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1, i = 1;
		int min = 0;
		int max = 100;

		System.out.println("How many time you play this GAME:");
		int round = sc.nextInt();

		while (i <= round) {
			int x = (int) (Math.random() * (max - min + 1) + min);
			System.out.println(x);
			int no;

			while (count <= 5) {
				System.out.println("Enter a number:");
				no = sc.nextInt();
				if (no == x) {
					System.out.println("you won the game:");
					break;
				} else {
					count++;
					System.out.println("please try again..");
				}
			}
			i++;
			
		}

	}// end of main

}// end of main class
