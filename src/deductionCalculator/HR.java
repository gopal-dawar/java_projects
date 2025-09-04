package deductionCalculator;

public class HR extends Employee {
	double salary;

	public HR(double salary) {
		this.salary = salary;
	}

	@Override
	public void printSalary() {
		double deduction = salary * 0.20;
		double updatedSalary = salary - deduction;
		System.out.println("Salary of HR : " + updatedSalary);
	}

}
