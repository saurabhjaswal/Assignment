package com.org.domain;

public class TemporaryEmp extends Employee {
	int paid_leave,sick_leave,casual_leave;
	double basic,hra,pf,deduction;

	void print_leave_details()
	{
		System.out.println("paid_leave:"+ paid_leave);
		System.out.println("sick_leave:"+ sick_leave);
		System.out.println("casual_leave :"+casual_leave);
	}
	@Override
	void calculate_balance_leaves()
		{
			System.out.println("total leaves are:"+ getTotal_leaves());
			
		}
	@Override
	boolean avail_leave(int no_of_leaves,char type_of_leave)
	{
		if(type_of_leave=='p'&& paid_leave>=no_of_leaves)
		{
			paid_leave=paid_leave-no_of_leaves;
			//super.avail_leave(no_of_leaves, type_of_leave);
		}
		else if(type_of_leave=='s'&& sick_leave>=no_of_leaves)
		{
			sick_leave=sick_leave-no_of_leaves;
			
		}
		else if(type_of_leave=='c'&& sick_leave>=no_of_leaves)
		{
			casual_leave=casual_leave-no_of_leaves;
		}
		return false;
		
	}
	public Double getBasic() 
	{
	return basic;
	}
	public void setBasic(Double basic)
	{
		this.basic=basic;
	}


	public int getPaid_leave() {
		return paid_leave;
	}
	public void setPaid_leave(int paid_leave) {
		this.paid_leave = paid_leave;
		int tl = getTotal_leaves()+paid_leave;
		setTotal_leaves(tl);
	}
	public int getSick_leave() {
		return sick_leave;
	}
	public void setSick_leave(int sick_leave) {
		this.sick_leave = sick_leave;
		int tl=getTotal_leaves()+sick_leave;
		setTotal_leaves(tl);
	}
	public int getCasual_leave() {
		return casual_leave;
	}
	public void setCasual_leave(int casual_leave) {
		this.casual_leave = casual_leave;
		int tl=getTotal_leaves()+casual_leave;
		setTotal_leaves(tl);
	}
	@Override
	void calculate_salary()
	{ //System.out.println(basic);
		pf = 0.12*basic;
		hra = 0.5* basic;
		//System.out.println("pf"+ pf);
		setTotal_salary(basic+hra-pf-deduction);
	}

	 public void addDeduction(int total_salaried_days, int total_days_for_deductions) {
		 
		double salary_per_day = getTotal_salary() / (double) total_salaried_days;
		  deduction = (salary_per_day * (double) total_days_for_deductions);
		  Double final_salary=(getTotal_salary()-deduction);
		 setTotal_salary(final_salary);
	}
	@Override
	public String toString() {
		return "TemporaryEmp [paid_leave=" + paid_leave + ", sick_leave=" + sick_leave + ", casual_leave="
				+ casual_leave + ", basic=" + basic + ", hra=" + hra + ", pf=" + pf + ", deduction=" + deduction
				+ ", getEmpid()=" + getEmpid() + ", getEmpName()=" + getEmpName() + ", getTotal_leaves()="
				+ getTotal_leaves() + ", getTotal_salary()=" + getTotal_salary() + " ]";
	}
	
	 
	}
	
	
	


	
	


