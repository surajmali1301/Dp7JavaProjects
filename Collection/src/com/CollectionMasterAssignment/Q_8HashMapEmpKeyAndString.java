package com.CollectionMasterAssignment;
//8. HashMap with Employee key and String value
import java.util.HashMap;
import java.util.Objects;

class Employee4 {
	private int emp_id;
	private String emp_name;
	private int emp_salary;

	public Employee4() {
		super();
	}

	public Employee4(int empId, String name, int emp_salary) {
		this.emp_id = empId;
		this.emp_name = name;
		this.emp_salary = emp_salary;
	}

	public int getEmpId() {
		return emp_id;
	}

	public String getName() {
		return emp_name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + emp_id + ", name=" + emp_name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_id, emp_name, emp_salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee4 other = (Employee4) obj;
		return emp_id == other.emp_id && Objects.equals(emp_name, other.emp_name) && emp_salary == other.emp_salary;
	}

	public class Q_8HashMapEmpKeyAndString {

		public static void main(String[] args) {
			HashMap<Employee4, String> employeeMap = new HashMap<>();

			Employee4 e1 = new Employee4(101, "Aniket", 50000);
			Employee4 e2 = new Employee4(102, "Hrishikesh", 60000);
			Employee4 e3 = new Employee4(101, "Aniket", 50000);

			employeeMap.put(e1, "Entry 1");
			employeeMap.put(e2, "Entry 2");
			employeeMap.put(e3, "Entry 3");

			System.out.println(employeeMap);
		}
	}

}