package com.test;

import com.employee.been.Employee;
import com.employee.utill.JsonUtill;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpNo(211);
		emp.setName("ram");
		emp.setSalary(2000);
		String jsonEmployee = JsonUtill.convertJavaToJSon(emp);
		System.out.println(jsonEmployee);
		System.out.println("____________________________");
		
		Employee emp1 =JsonUtill.convertJsonToJava(jsonEmployee, Employee.class);
		
		System.out.println(emp1.getSalary()+"    "+emp1.getName()+"  "+emp1.getEmpNo());
			
		 
	}

}
