package com.org.domain;

public class Master {
	public static void main(String[]arg) {
		System.out.println("For employee :");
		System.out.println();
		Employee obj=new Employee();
		obj.setEmpid(101);
		obj.setEmpName("Boyz");
		obj.setTotal_leaves(21);
		obj.setTotal_salary(20000.50d);
		obj.avail_leave(5, 'x');
		//obj.calculate_salary();
		System.out.println(obj.toString());
		System.out.println();
		System.out.println("for Permanent Employee :");
		
		PermanentEmp obj1= new PermanentEmp();
		obj1.setEmpid(102);
		obj1.setEmpName("Lethabe");
		obj1.setTotal_salary(25000.50d);
		obj1.setBasic(12000.10d);
		obj1.calculate_salary();
		obj1.setPaid_leave(5);
		obj1.setSick_leave(4);
		obj1.setCasual_leave(3);
		obj1.avail_leave(2, 's');
		obj1.addDeduction(20, 3);
		obj1.print_leave_details();
		System.out.println(obj1.toString());
		System.out.println();
		System.out.println("for Temporary Employee :");
		System.out.println();
		TemporaryEmp obj2=new TemporaryEmp();
		obj2.setEmpid(103);
		obj2.setEmpName("Khama");
		obj2.setTotal_salary(18000.50d);
		obj2.setBasic(10000.00d);
		obj2.calculate_salary();
		obj2.setPaid_leave(4);
		obj2.setSick_leave(3);
		obj2.setCasual_leave(1);
		obj2.avail_leave(2, 'p');
		obj2.addDeduction(20, 4);
		obj2.print_leave_details();
		System.out.println(obj2.toString());
		
		
		
		
		
		
		
		
	}

}
