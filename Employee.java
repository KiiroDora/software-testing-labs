
public class Employee {
	public int salary;
	public boolean isPromoted;
	public String name;
	public int minwage = 1000;
	static Employee[] promoteArray;
	
	public Employee(int salary, boolean isPromoted, String name) {
		this.salary = salary;
		this.isPromoted = isPromoted;
		this.name = name;
	}
	
	int newSalary (Employee e) {
		if (e.salary < minwage) {
			e.salary += e.salary/2;
		}
		
		return e.salary;
	}
	
	void promote (Employee e) {
		e.isPromoted = true;
	}
	
	Employee[] addPromote(Employee e) {
		Employee[] arr = new Employee [promoteArray.length+1];
		
		for (int i = 0; i <= promoteArray.length-1; i++) {
			arr[i] = promoteArray[i];
		}
		
		arr[arr.length-1] = e;
		return arr;
	}
	
}
