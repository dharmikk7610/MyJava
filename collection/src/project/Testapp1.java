package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testapp1 {

	public static void main(String[] args) {

		ArrayList<Student> Listobj = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		int srno;
		int i;
		boolean flag;
		while (true) {
			System.out.println("1>> Add");
			System.out.println("2>> Updatedata");
			System.out.println("3>> Searching");
			System.out.println("4>> Sorting");
			System.out.println("5>> DisplayData");
			System.out.println("6>> remove");
			System.out.println("7>> exit");

			System.out.println("Enter a choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				Student obj1 = new Student();
				obj1.Addstudent();
				Listobj.add(obj1);
				System.out.println("data is sucessfully inserted...");
				break;

			case 2:
				System.out.println("Enter a Rollnumber of student:");
				srno = sc.nextInt();
				 flag = false;
				i = 0;
				for (i = 0; i < Listobj.size(); i++) {
					Student obj3 = Listobj.get(i);
					if (obj3.getRno() == srno) {
						flag = true;
						break;
					}
				}
				if (flag) {
					Student obj5 = Listobj.get(i);
					obj5.updatedata();
					
					Listobj.set(i, obj5);  // perticular index pe object set kaneke lei..

				} else {
					System.out.println("Student roll number is not found..");
				}

				break;

			case 5:
				for(i = 0; i < Listobj.size(); i++) {
					Student obj2 = Listobj.get(i);
					obj2.Display();
				}
				break;

			case 6:
				System.out.println("Enter a Rollnumber of student for delete:");
				srno = sc.nextInt();
				flag = false;
				i = 0;
				for (i = 0; i < Listobj.size(); i++) {
					Student obj3 = Listobj.get(i);
					if (obj3.getRno() == srno) {
						flag = true;
						break;
					}
				}
				if (flag) {
					Listobj.remove(i);
					System.out.println("Student is remove sucessfully ....");
				} else {
					System.out.println("Student roll number is not found..");
				}

				break;

			case 3:
				System.out.println("Enter a Rollnumber of student:");
				srno = sc.nextInt();
				flag = false;
				i = 0;
				for (i = 0; i < Listobj.size(); i++) {
					Student obj3 = Listobj.get(i);
					if (obj3.getRno() == srno) {
						flag = true;
						break;
					}
				}
				if (flag) {
					Student obj4 = Listobj.get(i);
					obj4.Display();
				} else {
					System.out.println("Student roll number is not found..");
				}
				break;

			case 7:
				System.exit(0);
			}
		}

	}                       

}
