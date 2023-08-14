package com.collector;
/*public class Employee 
      { 
         private String firstName ;
         private String lastName;
         private Department department;
         private Designation designation ;
       } 
       
       
       public class Department 
        { 
          private String departmentName;
          private String location ;
         } 
         
         public class Designation 
          { 
            private String designation_type;
           } 
         
         
         
         #create instances of Employee and store in a list 
         
         #filter the list based on criteria where department="Sales" and designation="Manager"  and collect result into seperate list 
         #filter the list based on criterial where department location is Mumbai and collect result into seperate list 
         #display the with employee first and last name combined using a mapping operation and collect result in separate list*/
public class Employee {
	private String firstName ;
    private String lastName;
    private Department department;
    private Designation designation ;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public Employee(String firstName, String lastName, Department department, Designation designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + "]";
	}

}
