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

import com.demo.execption.EquipmentException;
import com.demo.execption.EquipmentNotFoundException;
import com.demo.vo.ClientVO;
import com.demo.vo.EngineerVO;
import com.demo.vo.LabourVO;
import com.demo.vo.EquipmentVO;



public class EquipmentDAO {
	public boolean addEquipmentDetails(EquipmentVO vo) throws EquipmentException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag = false;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "INSERT INTO Equipments(Equipment_Id,Equipment_Name)VALUES(?,?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1,vo.getEquipment_Id());
			ps.setString(2, vo.getEquipment_Name());
			ps.executeUpdate();
		}catch (SQLException e){
			throw new EquipmentException("Error when add the Equipment Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close(); 
			}catch (SQLException e){
				throw new EquipmentException("Error when add the Equipment Details" + e.getMessage());

			}
		}
		return flag;
	}
	public boolean updateEquipmentDetails(EquipmentVO vo) throws EquipmentException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "UPDATE Equipments set Equipment_Name =?WHERE Equipment_Id = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, vo.getEquipment_Name());
			ps.setInt(2, vo.getEquipment_Id());		
			ps.executeUpdate();
			flag = true;
				
			
		}catch (SQLException e){
			throw new EquipmentException("Error when add the Equipment Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new EquipmentException("Error when add the Equipment Details" + e.getMessage());

			}
		}
		return flag;
		
	}
	public EquipmentVO fetchEquipmentById(int Equipment_Id) throws EquipmentNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		EquipmentVO vo=new EquipmentVO();
		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Equipments where Equipment_Id=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, Equipment_Id);
			rs=ps.executeQuery();
			while(rs.next())
			{
			vo.setEquipment_Id(rs.getInt("Equipment_Id"));
			vo.setEquipment_Name(rs.getString("Equipment_Name"));
			}
		}
		catch(SQLException e)
		{
			throw new EquipmentNotFoundException("Error when fetch the Equipment Details" + e.getMessage());
		}
		finally
		{
			try{
				ps.close();
				connection.close();
			}catch(SQLException e){
				throw new EquipmentNotFoundException("Error when fetch the Equipment Details" + e.getMessage());

			}
		}
		return vo;
	}
	public List<EquipmentVO> fetchEquipmentByName(String Equipment_Name) throws EquipmentNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		EquipmentVO vo=new EquipmentVO();
		List<EquipmentVO> list = new ArrayList<EquipmentVO>();

		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Equipments where Equipment_Name=?";
			stmt=connection.prepareStatement(query);
			stmt.setString(1, Equipment_Name);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				vo.setEquipment_Id(rs.getInt("Equipment_Id"));
				vo.setEquipment_Name(rs.getString("Equipment_Name"));
				list.add(vo);
				
			}
		}
		catch(SQLException e){
			throw new EquipmentNotFoundException("Error when add the Equipments" + e.getMessage());
		}finally{
			try{
				stmt.close();
				connection.close();
			}catch(SQLException e){
				throw new EquipmentNotFoundException("Error when add the Equipments" + e.getMessage());

			}
		}
		return list;
	}


	}


