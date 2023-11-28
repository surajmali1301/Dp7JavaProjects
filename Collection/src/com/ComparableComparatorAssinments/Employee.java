package com.ComparableComparatorAssinments;

public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private String designation;
	private int age;
	private String country;
	private String state;

	public Employee(int id, String name,String designation,int age,String country,String state) {
		this.name=name;
		this.id = id;
		this.designation = designation;
		this.age = age;
		this.country=country;
		this.state=state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



//	@Override
//	public int compareTo(Employee emp) {
//		
//		if(this.get)
//	}
//	


public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public void setId(Integer id) {
	this.id = id;
}



// 4.Now modify Employee class so that it implements Comparable interface’s
// compareTo
//	method.Sorting should be done based on id in which use < , > & == technique
//	@Override
//	public int compareTo(Employee emp) {
//		if (this.id < emp.id) {
//			return 1;
//		} else if (this.id > emp.id) {
//			return -1;
//		} else {
//			return 0;
//		}
//	}

//5. Now do sorting on id but based on inbuilt compareTo method. Ensure to check 3 null conditions
//	@Override
//	public int compareTo(Employee emp) {
//		
//		if(this.getId()=='0'&&emp.getId()=='0')
//			return 0;
//		else if(this.getId()>emp.getId())
//			return 1;
//		return -1;
//
//	}

// 6. Now do descending sort of Employee.id in Employee Array list using < , > &
// == technique.
//	@Override
//	public int compareTo(Employee emp) {
//		// TODO Auto-generated method stub
//		if(emp.getId()>this.getId())
//			return 1;
//		else 
//			return -1;
//	}

// 7. Now do descending sort of Employee.id in Employee arraylist using inbuilt
// compareTo technique
//	@Override
//	public int compareTo(Employee emp) {
//		
//		Integer e1 = this.getId();
//		Integer e2 = emp.getId();
//		
//		return e2.compareTo(e1);
//	}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", country="
			+ country + ", state=" + state + "]";
}

	//9. Add Profile(state,country) object in Employee object. Do sorting of employees on the country basis.
@Override
public int compareTo(Employee emp) {
    if (this.country.compareTo(emp.country) > 0) {
        return 1;
    } else if (this.country.compareTo(emp.country) < 0) {
        return -1;
    } else {
        return 0;
    }
}

}


