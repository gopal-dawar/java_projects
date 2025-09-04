package calculator;

public class Addition extends Calculation {

	@Override
	public int[] addition(int n[]) {
		int choice = n.length;
		int sum = 0;
		switch (choice) {
		case 2: {
			sum = addition(n[0], n[1]);
			break;
		}
		case 3: {
			sum = addition(n[0], n[1], n[2]);
			break;
		}
		case 4: {
			sum = addition(n[0], n[1], n[2], n[3]);
			break;
		}
		case 5: {
			sum = addition(n[0], n[1], n[2], n[3], n[4]);
			
			break;
		}
		default:
			System.out.println("Exit");
		}
		n[0] = sum;
		return n;
	}

	public int addition(int a, int b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}

	public int addition(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public int addition(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
}
