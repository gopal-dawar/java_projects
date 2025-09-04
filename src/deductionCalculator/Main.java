package deductionCalculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Employee c;
			System.out.println("1. HR");
			System.out.println("2. Manager");
			System.out.println("3. Developer");
			System.out.println("4. Exit");
			System.out.println("Enter your operation : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter salary : ");
				double salary = sc.nextDouble();
				c = new HR(salary);
				c.printSalary();

				break;
			}
			case 2: {
				System.out.println("Enter salary : ");
				double salary = sc.nextDouble();
				c = new Manager(salary);
				c.printSalary();
				break;
			}
			case 3: {
				System.out.println("Enter salary : ");
				double salary = sc.nextDouble();
				c = new Developer(salary);
				c.printSalary();

				break;
			}
			default:
				System.out.println("Exit");
			}


	}
}
