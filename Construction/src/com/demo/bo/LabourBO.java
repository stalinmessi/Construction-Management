package com.demo.bo;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.LabourDAO;
import com.demo.execption.LabourException;
import com.demo.execption.LabourNotFoundException;
import com.demo.vo.LabourVO;

public class LabourBO {
	LabourDAO dao=new LabourDAO();
	public boolean addLabourDetails(LabourVO vo) throws LabourException
	{
		boolean flag;
		flag=dao.addLabourDetails(vo);
		return flag;		
	}
	public LabourVO fetchLabourById(int labour_id) throws LabourNotFoundException
	{
	LabourVO vo=new LabourVO();
	vo=dao.fetchLabourById(labour_id);
	return vo;
	}
	public List<LabourVO> fetchLabourByname(String name) throws LabourNotFoundException, LabourException
	{
		List<LabourVO>list=new ArrayList<LabourVO>();
		list=dao.fetchLabourByName("labour_Name");
		return list;
	}
	public boolean updateLabourDetails(LabourVO vo) throws LabourException
	{
		boolean flag;
		flag=dao.updateLabourDetails(vo);
	
		return flag;
		
	}
}


