package temp1.models;

public class Employee {
	private int empId;
	private String empName;
	private String empType;
	
	public Employee(int empi, String string, String string2) {
		this.empId = empi;
		this.empName = string;
		this.empType = string2;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	

}
