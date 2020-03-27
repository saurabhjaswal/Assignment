package com.org.domain;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String empName;
	private int total_leaves;
	private double total_salary;
	
	
	 public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getTotal_leaves() {
		return total_leaves;
	}
	public void setTotal_leaves(int total_leaves) {
		this.total_leaves = total_leaves;
	}
	public double getTotal_salary() {
		return total_salary;
	}
	public void setTotal_salary(double total_salary) {
		this.total_salary = total_salary;
	}
	void calculate_balance_leaves()
	{
		System.out.println("total leaves are:"+ total_leaves);
		
	}
	boolean avail_leave(int no_of_leaves,char type_of_leave)
	{
		if(total_leaves>no_of_leaves)
		{
				total_leaves=total_leaves-no_of_leaves;
				
		return true;
		}else
		{
			return false;
		}
	}
	void calculate_salary()
	{
		System.out.println("total salary is : "+total_salary);	
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", total_leaves=" + total_leaves
				+ ", total_salary=" + total_salary + "]";
	}
	
}
