package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.execption.LabourException;
import com.demo.execption.LabourNotFoundException;
import com.demo.vo.ClientVO;
import com.demo.vo.LabourVO;



public class LabourDAO {
	public boolean flag;
	public boolean addLabourDetails(LabourVO vo) throws LabourException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag = false;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "INSERT INTO labour (labour_id,labour_Name,labour_Age,labour_Address,labour_mobile)VALUES(?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			int i = ps.executeUpdate(query);
		}catch (SQLException e){
			throw new LabourException("Error when add the labour Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new LabourException("Error when add the labour Details" + e.getMessage());

			}
		}
		return flag;
	}
	public boolean updateLabourDetails(LabourVO vo) throws LabourException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "UPDATE labour set labour_Name =?,labour_Address =?, WHERE labour_id = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, vo.getLabour_Name());
			ps.setString(2, vo.getLabour_Address());
			ps.setInt(3, vo.getLabour_id());
			ps.executeUpdate();
			flag = true;
				
			
		}catch (SQLException e){
			throw new LabourException("Error when add the labour Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new LabourException("Error when add the Engineer Details" + e.getMessage());

			}
		}
		return flag;
		
	}
	public LabourVO fetchLabourById(int labour_id) throws LabourNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		LabourVO vo=new LabourVO();
		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Labour where Labour_id=?";
			ps=connection.prepareStatement(query);
			ps.setInt(1, vo.getLabour_id());
			ps.setString(2, vo.getLabour_Name());
			ps.setString(3, vo.getLabour_Address());
			rs=ps.executeQuery(query);
			while(rs.next())
			{
				int labour_id1=rs.getInt("Labour_id");
				String labour_name=rs.getString("Labour_name");
				float labour_salary=rs.getFloat("Labour_salary");
				System.out.println(labour_id+" "+labour_name+"  "+labour_salary);
				
			}
		}
		catch(SQLException e)
		{
			throw new LabourNotFoundException("Error when fetch the labour Details" + e.getMessage());
		}
		finally
		{
			try{
				ps.close();
				connection.close();
			}catch(SQLException e){
				throw new LabourNotFoundException("Error when add the labour Details" + e.getMessage());

			}
		}
		return vo;
	}
	public List<LabourVO> fetchLabourByName(String Labour_Name) throws LabourException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		LabourVO vo=new LabourVO();
		List<LabourVO> list = new ArrayList<LabourVO>();
		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Labour where labour_name=?";
			stmt=connection.prepareStatement(query);
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				vo.setLabour_id(rs.getInt("labour_id"));
				vo.setLabour_Name(rs.getString("labour_name"));
				Integer labour_id=vo.getLabour_id();
		
			}
		}
		catch(SQLException e){
			throw new LabourException("Error when add the labour Details" + e.getMessage());
		}finally{
			try{
				stmt.close();
				connection.close();
			}catch(SQLException e){
				throw new LabourException("Error when add the labour Details" + e.getMessage());

			}
		}
		return list;
	}
}