package com.salary.cc;

public class User {
	int Employee_ID_Number;
    String First_Name;
    String Last_Name;
    String Password ;
    String Date_of_Birth;
    String Contact_Number;
    String job;
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getJob() {
		return job;
	}
	public int getYearSalary() {
		return salary*12+bonus;
	}
	@Override
	public String toString() {
		return "User [Employee_ID_Number=" + Employee_ID_Number + ", First_Name=" + First_Name + ", Last_Name="
				+ Last_Name + ", Password=" + Password + ", Date_of_Birth=" + Date_of_Birth + ", Contact_Number="
				+ Contact_Number + ", job=" + job + ", salary=" + salary + ", bonus=" + bonus + "]";
	}
	public void setJob(String job) {
		this.job = job;
	}
	int salary;
    int bonus;
	public int getEmployee_ID_Number() {
		return Employee_ID_Number;
	}
	public void setEmployee_ID_Number(int employee_ID_Number) {
		Employee_ID_Number = employee_ID_Number;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDate_of_Birth() {
		return Date_of_Birth;
	}
	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}
	public String getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
    
}
