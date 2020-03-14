package com.demo.response;

import java.util.List;

import com.demo.vo.EquipmentVO;
import com.demo.vo.MaterialVO;

public class MaterialResponseObject {
	String successMessage;                                                        
	 String failureMessage;
	         List<MaterialVO> MaterialList;
	         MaterialVO materialVO;
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
			public List<MaterialVO> getMaterialList() {
				return MaterialList;
			}
			public void setMaterialList(List<MaterialVO> materialList) {
				MaterialList = materialList;
			}
			public MaterialVO getMaterialVO() {
				return materialVO;
			}
			public void setMaterialVO(MaterialVO materialVO) {
				this.materialVO = materialVO;
			}
}
