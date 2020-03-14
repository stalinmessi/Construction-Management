package com.demo.service;

import com.demo.bo.ClientBO;
import com.demo.execption.ClientException;
import com.demo.response.ClientResponseObject;
import com.demo.vo.ClientVO;

public class ClientService {
	ClientBO bo = new ClientBO ();
	ClientResponseObject obj = new ClientResponseObject();
	public ClientResponseObject addClientDetails1(ClientVO vo) throws ClientException
	{
		boolean flag;
		try 
		{
			flag = bo.addClientDetails(vo);
			if (flag)
				obj.setSuccessMessage("Client Added Successfully");
			else
				obj.setFailureMessage("Error When Adding Client Details, Reach out Administrator");
		}
		catch (ClientException e) {
			obj.setFailureMessage("Error When Adding The Client Details" + e.getMessage());
		}
		return obj;
	}
	public ClientResponseObject addClientDetails(ClientVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
