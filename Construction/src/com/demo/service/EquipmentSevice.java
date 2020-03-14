package com.demo.service;

import java.util.List;

import com.demo.bo.EquipmentBO;
import com.demo.execption.EquipmentException;
import com.demo.execption.EquipmentNotFoundException;
import com.demo.response.EquipmentResponseObject;
import com.demo.vo.EquipmentVO;

public class EquipmentSevice {
	EquipmentBO bo = new EquipmentBO();
	EquipmentResponseObject obj = new EquipmentResponseObject();
	public EquipmentResponseObject addEquipmentDetails(EquipmentVO vo) throws EquipmentException
	{
		boolean flag;
		try 
		{
			flag = bo.addEquipmentDetails(vo);
			if (flag)
				obj.setSuccessMessage("Equipment Added Successfully");
			else
				obj.setFailureMessage("Error When Adding Equipment Details, Reach out Administrator");
		}
		catch (EquipmentException e) {
			obj.setFailureMessage("Error When Adding The EquipmentDetails" + e.getMessage());
		}
		return obj;
	}
	public EquipmentResponseObject updateEquipmentDetails(EquipmentVO vo) {
		boolean flag;
		try 
		{
			flag = bo.updateEquipmentDetails(vo);
			if (flag)
				obj.setSuccessMessage("Equipment updated Successfully");
			else
				obj.setFailureMessage("Error When update Equipment Details, Reach out Administrator");
		}
		catch (EquipmentException e) {
			obj.setFailureMessage("Error When update The EquipmentDetails" + e.getMessage());
		}
		return obj;
		// TODO Auto-generated method stub

	}
	public EquipmentResponseObject fetchEquipmentById(Integer Equipment_Id) throws EquipmentNotFoundException {
		// TODO Auto-generated method stub
		
		try 
		{
			EquipmentVO vo;
			vo =bo.fetchEquipmentById(Equipment_Id);
			obj.setEquipmentVo(vo);
		
		}
		catch( EquipmentNotFoundException e) {
			obj.setFailureMessage("Error When fetching The EquipmentDetails" + e.getMessage());
		}
		return obj;
		
	}
	public EquipmentResponseObject fetchEquipmentByName(String Equipment_Name) throws EquipmentNotFoundException{
		try {
			 List<EquipmentVO> list;
				list =bo.fetchEquipmentByName(Equipment_Name);
				obj.setEquipmentVO(list);
				

		} catch(EquipmentNotFoundException e)
		{
			obj.setFailureMessage("Error When fetching The EquipmentDetails" + e.getMessage());

		}
		return obj;
	}
	}

