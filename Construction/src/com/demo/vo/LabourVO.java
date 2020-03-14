package com.demo.vo;
public class LabourVO {
	private int labour_id;
	private String labour_Name;
	private String labour_gender;
	private int labour_age;
	private String labour_Address;
	private long labour_mobile;
	public int getLabour_id() {
		return labour_id;
	}
	public void setLabour_id(int labour_id) {
		this.labour_id = labour_id;
	}
	public String getLabour_Name() {
		return labour_Name;
	}
	public void setLabour_Name(String labour_Name) {
		this.labour_Name = labour_Name;
	}
	public String getLabour_gender() {
		return labour_gender;
	}
	public void setLabour_gender(String labour_gender) {
		this.labour_gender = labour_gender;
	}
	public int getLabour_age() {
		return labour_age;
	}
	public void setLabour_age(int labour_age) {
		this.labour_age = labour_age;
	}
	public String getLabour_Address() {
		return labour_Address;
	}
	public void setLabour_Address(String labour_Address) {
		this.labour_Address = labour_Address;
	}
	public long getLabour_mobile() {
		return labour_mobile;
	}
	public void setLabour_mobile(long labour_mobile) {
		this.labour_mobile = labour_mobile;
	}
	@Override
	public String toString() {
		return "LabourVO [labour_id=" + labour_id + ", labour_Name=" + labour_Name + ", labour_gender=" + labour_gender
				+ ", labour_age=" + labour_age + ", labour_Address=" + labour_Address + ", labour_mobile="
				+ labour_mobile + ", getLabour_id()=" + getLabour_id() + ", getLabour_Name()=" + getLabour_Name()
				+ ", getLabour_gender()=" + getLabour_gender() + ", getLabour_age()=" + getLabour_age()
				+ ", getLabour_Address()=" + getLabour_Address() + ", getLabour_mobile()=" + getLabour_mobile() + "]";
	}
}