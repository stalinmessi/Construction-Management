package com.demo.bo;

import java.util.ArrayList;
import java.util.List;

import com.demo.dao.MaterialDAO;
import com.demo.execption.EquipmentException;
import com.demo.execption.EquipmentNotFoundException;
import com.demo.execption.MaterialException;
import com.demo.execption.MaterialNotFoundException;
import com.demo.vo.MaterialVO;

public class MaterialBO {
	MaterialDAO dao=new MaterialDAO();
	public boolean addMaterialDetails(MaterialVO vo) throws MaterialException
	{
		try {
			boolean flag;
			flag=dao.addMaterialDetails(vo);
			return flag;
		}catch(MaterialException e) {
			throw new MaterialException("Error when adding details"+e.getMessage());
		}		
	}
	public MaterialVO fetchMaterialById(int Material_id) throws MaterialNotFoundException
	{
		try {
		MaterialVO vo=new MaterialVO();
		vo=dao.fetchMaterialById(Material_id);
		return vo;
		}
		catch(MaterialNotFoundException e)
		{
		
			throw new MaterialNotFoundException("Error when fetch details"+e.getMessage());
		}		
		}
	
	
	public List<MaterialVO> fetchMaterialByName(String Material_name) throws MaterialNotFoundException
	{
		try {
		List<MaterialVO>list=new ArrayList<MaterialVO>();
		 list=dao.fetchMaterialByName(Material_name);
		 return list;
		}
		catch(MaterialNotFoundException e)
		{
		
			throw new MaterialNotFoundException("Error when fetch details"+e.getMessage());
		}		
		

	}
	public boolean updateMaterialDetails(MaterialVO vo) throws MaterialException
	{
		{

				try {
					boolean flag;
					flag=dao.updateMaterialDetails(vo);
					return flag;
				}
				catch(MaterialException e )
				{
					throw new MaterialException("Error when updating details"+e.getMessage());
				}
			}
			
		}
	}
