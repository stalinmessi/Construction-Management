package com.demo.vo;

public class EngineerVO {
	private int engineer_Id;
	private String engineer_Name;
	private String engineer_Gender;
	private String engineer_Address;
	private int engineer_Age;
	private Long engineer_Mobile;
	private float engineer_Salary;
	public int getEngineer_Id() {
		return engineer_Id;
	}
	@Override
	public String toString() {
		return "EngineerVO [engineer_Id=" + engineer_Id + ", engineer_Name=" + engineer_Name + ", engineer_Gender="
				+ engineer_Gender + ", engineer_Address=" + engineer_Address + ", engineer_Age=" + engineer_Age
				+ ", engineer_Mobile=" + engineer_Mobile + ", engineer_Salary=" + engineer_Salary
				+ ", getEngineer_Id()=" + getEngineer_Id() + ", getEngineer_Name()=" + getEngineer_Name()
				+ ", getEngineer_Gender()=" + getEngineer_Gender() + ", getEngineer_Address()=" + getEngineer_Address()
				+ ", getEngineer_Age()=" + getEngineer_Age() + ", getEngineer_Mobile()=" + getEngineer_Mobile()
				+ ", getEngineer_Salary()=" + getEngineer_Salary() + "]";
	}
	public void setEngineer_Id(int engineer_Id) {
		this.engineer_Id = engineer_Id;
	}
	public String getEngineer_Name() {
		return engineer_Name;
	}
	public void setEngineer_Name(String engineer_Name) {
		this.engineer_Name = engineer_Name;
	}
	public String getEngineer_Gender() {
		return engineer_Gender;
	}
	public void setEngineer_Gender(String engineer_Gender) {
		this.engineer_Gender = engineer_Gender;
	}
	public String getEngineer_Address() {
		return engineer_Address;
	}
	public void setEngineer_Address(String engineer_Address) {
		this.engineer_Address = engineer_Address;
	}
	public int getEngineer_Age() {
		return engineer_Age;
	}
	public void setEngineer_Age(int engineer_Age) {
		this.engineer_Age = engineer_Age;
	}
	public Long getEngineer_Mobile() {
		return engineer_Mobile;
	}
	public void setEngineer_Mobile(Long engineer_Mobile) {
		this.engineer_Mobile = engineer_Mobile;
	}
	public float getEngineer_Salary() {
		return engineer_Salary;
	}
	public void setEngineer_Salary(float engineer_Salary) {
		this.engineer_Salary = engineer_Salary;
	}
}