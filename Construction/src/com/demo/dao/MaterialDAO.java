package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.execption.MaterialException;
import com.demo.execption.MaterialNotFoundException;
import com.demo.vo.ClientVO;
import com.demo.vo.EngineerVO;
import com.demo.vo.LabourVO;
import com.demo.vo.MaterialVO;



public class MaterialDAO {
	public boolean addMaterialDetails(MaterialVO vo) throws MaterialException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "INSERT INTO Material_info(Material_id,Material_name,Material_quality,Material_price)VALUES(?,?,?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, vo.getMaterial_id());
			ps.setString(2, vo.getMaterial_name());
			ps.setString(3, vo.getMaterial_quality());
			ps.setDouble(4, vo.getMaterial_price());
			ps.executeUpdate();
			flag=true;
		}catch (SQLException e){
			throw new MaterialException("Error when add the Material Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new MaterialException("Error when add the Material Details" + e.getMessage());

			}
		}
		return flag;
	}
	public boolean updateMaterialDetails(MaterialVO vo) throws MaterialException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "UPDATE Material_info set Material_name =?,Material_quality =?,Material_price=?, WHERE Material_id = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, vo.getMaterial_name());
			ps.setString(2, vo.getMaterial_quality());
			ps.setDouble(3, vo.getMaterial_price());
			ps.setInt(4, vo.getMaterial_id());
			ps.executeUpdate();
			flag = true;
				
			
		}catch (SQLException e){
			throw new MaterialException("Error when add the Material Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new MaterialException("Error when add the MaterialDetails" + e.getMessage());

			}
		}
		return flag;
		
	}
	public MaterialVO fetchMaterialById(int Material_id) throws MaterialNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		MaterialVO vo=new MaterialVO();
		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Material_info where Material_id?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, Material_id);
			rs=ps.executeQuery();
			while(rs.next())
			{
				vo.setMaterial_id(rs.getInt("Material_id"));
				vo.setMaterial_name(rs.getString("Material_name"));
			}
		}
		catch(SQLException e)
		{
			throw new MaterialNotFoundException("Error when add the Material Details" + e.getMessage());
		}
		finally
		{
			try{
				ps.close();
				connection.close();
			}catch(SQLException e){
				throw new MaterialNotFoundException("Error when add the Material Details" + e.getMessage());

			}
		}
		return vo;
	}
	public 	List<MaterialVO> fetchMaterialByName(String Material_name) throws MaterialNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		MaterialVO vo=new MaterialVO();
		List<MaterialVO> list = new ArrayList<MaterialVO>();

		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Material_info where Material_name?";
			stmt=connection.prepareStatement(query);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				vo.setMaterial_id(rs.getInt("Material_id"));
				vo.setMaterial_name(rs.getString("Material_name"));
				list.add(vo);
			
			}
		}
		catch(SQLException e){
			throw new MaterialNotFoundException("Error when add the Material Details" + e.getMessage());
		}finally{
			try{
				stmt.close();
				connection.close();
			}catch(SQLException e){
				throw new MaterialNotFoundException("Error when add the Material Details" + e.getMessage());

			}
		}
		return list;
	}
	


	}

