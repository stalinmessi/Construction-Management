package com.demo.response;

import java.util.List;

import com.demo.vo.EngineerVO;

public class EngineerResponseObject {
	String successMessage;                                                        
	 String failureMessage;
	         List<EngineerVO> EngineerList;
	         EngineerVO engineerVO;
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
			public List<EngineerVO> getEngineerList() {
				return EngineerList;
			}
			public void setEngineerList(List<EngineerVO> engineerList) {
				EngineerList = engineerList;
			}
			public EngineerVO getEngineerVO() {
				return engineerVO;
			}
			public void setEngineerVO(EngineerVO engineerVO) {
				this.engineerVO = engineerVO;
			}

}
