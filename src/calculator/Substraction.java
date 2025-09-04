package calculator;

public class Substraction extends Calculation {

	@Override
	public int[] substraction(int n[]) {
		
		int choice = n.length;
		int sum = 0;
		switch (choice) {
		case 2: {
			sum = substraction(n[0], n[1]);
			break;

		}
		case 3: {
			sum = substraction(n[0], n[1], n[2]);
			break;
		}
		case 4: {
			sum = substraction(n[0], n[1], n[2], n[3]);
			break;
		}
		case 5: {
			sum = substraction(n[0], n[1], n[2], n[3], n[4]);

			break;
		}
		default:
			System.out.println("Exit");
		}
		n[0] = sum;
		
		return n;
	}

	public int substraction(int a, int b) {
		return a - b;
	}
	
	public int substraction(int a, int b, int c) {
		return a - b - c;
	}

	public int substraction(int a, int b, int c, int d) {
		return a - b - c - d;
	}

	public int substraction(int a, int b, int c, int d, int e) {
		return a - b - c - d - e;
	}

}
