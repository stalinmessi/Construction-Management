package com.demo.vo;

public class EquipmentVO {
private  int Equipment_Id;
@Override
public String toString() {
	return "EquipmentVO [Equipment_Id=" + Equipment_Id + ", Equipment_Name=" + Equipment_Name + ", getEquipment_Id()="
			+ getEquipment_Id() + ", getEquipment_Name()=" + getEquipment_Name() + "]";
}
public int getEquipment_Id() {
	return Equipment_Id;
}
public void setEquipment_Id(int equipment_Id) {
	Equipment_Id = equipment_Id;
}
public String getEquipment_Name() {
	return Equipment_Name;
}
public void setEquipment_Name(String equipment_Name) {
	Equipment_Name = equipment_Name;
}
private String Equipment_Name;
}

