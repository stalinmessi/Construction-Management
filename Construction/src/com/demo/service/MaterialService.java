package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.bo.MaterialBO;
import com.demo.execption.MaterialException;
import com.demo.execption.MaterialNotFoundException;
import com.demo.response.MaterialResponseObject;
import com.demo.vo.MaterialVO;

public class MaterialService {
	MaterialBO bo = new MaterialBO();
	MaterialResponseObject obj = new MaterialResponseObject();
	public MaterialResponseObject addMaterial(MaterialVO vo) throws MaterialException
	{
		boolean flag;
		try 
		{
			flag = bo.addMaterialDetails(vo);
			if (flag)
				obj.setSuccessMessage("Material Added Successfully");
			else
				obj.setFailureMessage("Error When Adding Details, Material Reach out Administrator");
		}
		catch (MaterialException e) {
			obj.setFailureMessage("Error When Adding The MaterialDetails" + e.getMessage());
		}
		return obj;

	}
	public MaterialResponseObject fetchMaterialById(int Material_id) throws MaterialNotFoundException {
		try {
			MaterialVO vo;
			vo = bo.fetchMaterialById(Material_id);
			obj.setMaterialVO(vo);
		} catch (MaterialNotFoundException e) {
			obj.setFailureMessage("Error When Fetching The department Details" + e.getMessage());
		}
		return obj;
	}
public MaterialResponseObject fetchMaterialByName(String Material_name) throws MaterialNotFoundException, MaterialException {

		try {
			List<MaterialVO> list;
			list = bo.fetchMaterialByName(Material_name);
			obj.setMaterialList(list);

		} catch (MaterialNotFoundException e) {
			obj.setFailureMessage("Error When Fetching The  Details" + e.getMessage());
		}
		return obj;
	}
	public MaterialResponseObject updateMaterialDetails(MaterialVO vo) {
		boolean flag;
		try 
		{
			flag = bo.updateMaterialDetails(vo);
			if (flag)
				obj.setSuccessMessage("Material updated Successfully");
			else
				obj.setFailureMessage("Error When updating Details, Material Reach out Administrator");
		}
		catch (MaterialException e) {
			obj.setFailureMessage("Error When updating The MaterialDetails" + e.getMessage());
		}
		return obj;
		// TODO Auto-generated method stub
		
	}
}

	