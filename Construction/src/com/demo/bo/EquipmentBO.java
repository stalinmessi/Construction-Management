package com.demo.bo;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.EquipmentDAO;
import com.demo.execption.EquipmentException;
import com.demo.execption.EquipmentNotFoundException;
import com.demo.vo.EquipmentVO;

public class EquipmentBO {

	EquipmentDAO dao=new EquipmentDAO();
	public boolean addEquipmentDetails(EquipmentVO vo) throws EquipmentException
	{
		try {
			boolean flag;

		flag=dao.addEquipmentDetails(vo);
		return flag;
		}
		catch(EquipmentException e )
		{
			throw new EquipmentException("Error when adding details"+e.getMessage());
		}

	}
	public EquipmentVO fetchEquipmentById(int Equipment_Id) throws EquipmentNotFoundException
	{
			EquipmentVO vo=new EquipmentVO();
	vo=dao.fetchEquipmentById(Equipment_Id);
	return vo;
		}
	
	public List<EquipmentVO> fetchEquipmentByName(String Equipment_Name) throws EquipmentNotFoundException
	{
			List<EquipmentVO>list=new ArrayList<EquipmentVO>();
			list=dao.fetchEquipmentByName("Equipment_Name");
			return list;
	}
		
	public boolean updateEquipmentDetails(EquipmentVO vo) throws EquipmentException
	
	{
		
			try {
				boolean flag;
			
			flag=dao.updateEquipmentDetails(vo);
			return flag;

			}
			catch(EquipmentException e )
			{
				throw new EquipmentException("Error when updating details"+e.getMessage());
			
		}
		
	}
}



