package com.demo.response;

import java.util.List;

import com.demo.vo.ClientVO;
import com.demo.vo.LabourVO;

public class LabourResponseObject {
	String successMessage;                                                        
	 String failureMessage;
	         List<LabourVO> LabourList;
	         LabourVO labourVO;
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
			public List<LabourVO> getLabourList() {
				return LabourList;
			}
			public void setLabourList(List<LabourVO> labourList) {
				LabourList = labourList;
			}
			public LabourVO getLabourVO() {
				return labourVO;
			}
			public void setLabourVO(LabourVO labourVO) {
				this.labourVO = labourVO;
			}
}
