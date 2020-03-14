package com.demo.vo;

public class MaterialVO {
	private int Material_id;
	private String Material_name;
	private String Material_quality;
	private double Material_price;
	public int getMaterial_id() {
		return Material_id;
	}
	public void setMaterial_id(int material_id) {
		Material_id = material_id;
	}
	public String getMaterial_name() {
		return Material_name;
	}
	public void setMaterial_name(String material_name) {
		Material_name = material_name;
	}
	public String getMaterial_quality() {
		return Material_quality;
	}
	public void setMaterial_quality(String material_quality) {
		Material_quality = material_quality;
	}
	public double getMaterial_price() {
		return Material_price;
	}
	public void setMaterial_price(double material_price) {
		Material_price = material_price;
	}
	@Override
	public String toString() {
		return "MaterialVO [Material_id=" + Material_id + ", Material_name=" + Material_name + ", Material_quality="
				+ Material_quality + ", Material_price=" + Material_price + ", getMaterial_id()=" + getMaterial_id()
				+ ", getMaterial_name()=" + getMaterial_name() + ", getMaterial_quality()=" + getMaterial_quality()
				+ ", getMaterial_price()=" + getMaterial_price() + "]";
	}
}