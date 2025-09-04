package deductionCalculator;

public class Manager extends Employee {
	double salary;

	public Manager(double salary) {
		this.salary = salary;
	}

	@Override
	public void printSalary() {
		double deduction = salary * 0.10;
		double updatedSalary = salary - deduction;
		System.out.println("Salary of Manager : " + updatedSalary);
		
	}
}
