package com.demo.response;

import java.util.List;

import com.demo.vo.EquipmentVO;

public class EquipmentResponseObject {
	String successMessage;
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public String getFailureMessage() {
		return failureMessage;
	}
	public void setFailureMessage(String failureMessage) {
		this.failureMessage = failureMessage;
	}
	public List<EquipmentVO> getEquipmentVO() {
		return equipmentList;
	}
	public void setEquipmentVO(List<EquipmentVO> equipmentList) {
		this.equipmentList = equipmentList;
	}
	public EquipmentVO getEquipmentVo() {
		return equipmentVo;
	}
	public void setEquipmentVo(EquipmentVO equipmentVo) {
		this.equipmentVo = equipmentVo;
	}
	String failureMessage;
	List<EquipmentVO> equipmentList;
	EquipmentVO equipmentVo;
}
