package temp1.models;

import java.util.ArrayList;


public class EmployeeServices {
	ArrayList<Employee> EmployeeList;
	
	public EmployeeServices()
	{
		EmployeeList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee emp1) {
		EmployeeList.add(emp1);
		System.out.println("Employee Added Successfully");
	}
	
	public void getAllEmployee(){
		for(Employee empI : EmployeeList) {
			System.out.println(""+empI.getEmpId()+" "+empI.getName()+" "+empI.getEmpType()+"");
		}
	}

}
