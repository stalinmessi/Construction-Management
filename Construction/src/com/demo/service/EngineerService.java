package com.demo.service;

import com.demo.bo.EngineerBO;
import com.demo.execption.EngineerException;
import com.demo.response.EngineerResponseObject;
import com.demo.vo.EngineerVO;

public class EngineerService {
	EngineerBO bo = new EngineerBO();
	EngineerResponseObject obj = new EngineerResponseObject();
	public EngineerResponseObject addEngineer(EngineerVO vo) throws EngineerException
	{
		boolean flag;
		try 
		{
			flag = bo.addEngineerDetails(vo);
			if (flag)
				obj.setSuccessMessage("Engineer Added Successfully");
			else
				obj.setFailureMessage("Error When Adding Engineer Details, Reach out Administrator");
		}
		catch (EngineerException e) {
			obj.setFailureMessage("Error When Adding The EngineerDetails" + e.getMessage());
		}
		return obj;
	}
	public static EngineerResponseObject addEngineerDetails(EngineerVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	public EngineerResponseObject updateEngineer(EngineerVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
