package com.demo.response;

import java.util.List;

import com.demo.vo.ClientVO;

public class ClientResponseObject {
	String successMessage;                                                        
	 String failureMessage;
	         List<ClientVO> ClientList;
	         ClientVO clientVO;
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
			public List<ClientVO> getClientList() {
				return ClientList;
			}
			public void setClientList(List<ClientVO> clientList) {
				ClientList = clientList;
			}
			public ClientVO getClientVO() {
				return clientVO;
			}
			public void setClientVO(ClientVO clientVO) {
				this.clientVO = clientVO;
			}

}
