package temp1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import temp1.models.Employee;
import temp1.models.EmployeeServices;

@ComponentScan(basePackages="temp1.main")
public class MainEmployee {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("proconf.xml");
		EmployeeServices emp1 = context.getBean(EmployeeServices.class);
		
		
		emp1.addEmployee(new Employee(1,"Omdev","Int"));
		emp1.addEmployee(new Employee(2,"Virat","Cricketer"));
		emp1.addEmployee(new Employee(3, "Leonal Messi", "Barcelona"));
		
		emp1.getAllEmployee();
	}
}
