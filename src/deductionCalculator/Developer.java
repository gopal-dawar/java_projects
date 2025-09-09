package deductionCalculator;

public class Developer extends Employee {
	double salary;

	public Developer(double salary) {
		this.salary = salary;
	}

	@Override
	public void printSalary() {
		double deduction = salary * 0.20;
		double updatedSalary = salary - deduction;
		System.out.println("Salary of Developer : " + updatedSalary);
	}
}
