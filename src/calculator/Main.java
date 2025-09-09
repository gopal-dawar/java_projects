package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calculation c; 
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("Enter operation : ");
		int choice = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter value less then 6 : ");
		String str1 = sc.nextLine();

		String[] arrStr = str1.trim().split(" ");
		int[] values = new int[arrStr.length];
		
		
		for (int i = 0; i < arrStr.length; i++) {
			values[i] = Integer.parseInt(arrStr[i]);
		}

		switch (choice) {
		case 1: {
			c = new Addition();
			int[] sum = c.addition(values);
			System.out.println("Addition : " + sum[0]);
			break;
		}
		case 2: {
			c = new Substraction();
			int[] sum = c.substraction(values);
			System.out.println("Substraction : " + sum[0]);
			break;
		}
		case 3: {
			c = new Multiplication();
			int[] sum = c.multiplication(values);
			System.out.println("Multiplication : " + sum[0]);
			break;
		}
		default:
			System.out.println("Exit");
		}

		sc.close();
	}
}
