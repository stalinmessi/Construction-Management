package com.demo.bo;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.EngineerDAO;
import com.demo.execption.EngineerException;
import com.demo.execption.EngineerNotFoundException;
import com.demo.vo.EngineerVO;

public class EngineerBO {
	EngineerDAO dao=new EngineerDAO();
	public boolean addEngineerDetails(EngineerVO vo) throws EngineerException
	{
		boolean flag;
		flag=dao.addEngineerDetails(vo);
		return flag;		
	}
	public EngineerVO fetchEngineerById(int engineer_id) throws EngineerNotFoundException
	{
	EngineerVO vo=new EngineerVO();
	vo=dao.fetchEngineerById(engineer_id);
	return vo;
	}
	public List<EngineerVO> fetchEngineerByname(String name) throws EngineerNotFoundException
	{
		List<EngineerVO>list=new ArrayList<EngineerVO>();
		list=dao.fetchEngineerByname("Engineer_name");
		return list;
	}
	public boolean updateEngineerDetails(EngineerVO vo) throws EngineerException
	{
		boolean flag;
		flag=dao.updateEngineerDetails(vo);
		return flag;
		
	}

}
