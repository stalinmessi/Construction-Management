package com.demo.bo;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.ClientDAO;
import com.demo.execption.ClientException;
import com.demo.execption.ClientNotFoundException;
import com.demo.vo.ClientVO;

public class ClientBO {

	 ClientDAO dao=new  ClientDAO();
	public boolean addClientDetails( ClientVO vo) throws  ClientException
	{
		boolean flag;
		try {
		
		flag=dao.addClientDetails(vo);
		}
		catch( ClientException e )
		{
			throw new  ClientException("Error when adding details"+e.getMessage());
		}
		return flag;
	}
	public  ClientVO fetchClientById(int  Client_id) throws  ClientNotFoundException
	{
		 ClientVO vo=new  ClientVO();
	vo=dao.fetchClientById( Client_id);
	return vo;
	}
	public List< ClientVO> fetchClientByname(String client_name) throws  ClientNotFoundException, ClientException
	{
		List< ClientVO>list=new ArrayList< ClientVO>();
		list=dao.fetchClientByName(" Client_Name");
		return list;
	}
	public boolean updateClientDetails( ClientVO vo) throws  ClientException
	{
		boolean flag;
		flag=dao.updateClientDetails(vo);
	
		return flag;
		
	}
}