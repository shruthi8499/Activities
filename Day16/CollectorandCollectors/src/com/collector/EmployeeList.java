package com.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee("alex","jones",new Department("sales","hyd"),new Designation("manager")));
		list.add(new Employee("sam","zon",new Department("marketing","mumbai"),new Designation("salesman")));
		list.add(new Employee("alice","smith",new Department("production","bangalore"),new Designation("HR")));
		List<Employee> sales=list.stream().filter((e)->e.getDepartment().getDepartmentName().equals("sales")&&e.getDesignation().getDesignation_type().equals("manager")).collect(Collectors.toList());
		System.out.println(sales);
		List<Employee> mumbai=list.stream().filter(e->e.getDepartment().getLocation().equals("mumbai")).collect(Collectors.toList());
		System.out.println(mumbai);
		List<String> name=list.stream().collect(Collectors.mapping((Employee e)->e.getFirstName()+" "+e.getLastName(),Collectors.toList()));
		System.out.println(name);
		
		
		
		
	}


}
