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

import com.demo.execption.EngineerException;
import com.demo.execption.EngineerNotFoundException;
import com.demo.vo.ClientVO;
import com.demo.vo.EngineerVO;
import com.demo.vo.LabourVO;



public class EngineerDAO {
	public boolean addEngineerDetails(EngineerVO vo) throws EngineerException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag = false;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "INSERT INTO Engineer (Engineer_id,Engineer_Name,Engineer_Age,Engineer_Address,Engineer_mobile)VALUES(?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			int i = ps.executeUpdate(query);
			ps.setInt(1,vo.getEngineer_Id());
			ps.setString(2, vo.getEngineer_Name());
			ps.setInt(3, vo.getEngineer_Age());
			ps.setString(4, vo.getEngineer_Address());
			ps.setLong(5, vo.getEngineer_Mobile());
		}catch (SQLException e){
			throw new EngineerException("Error when add the Engineer Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new EngineerException("Error when add the Engineer Details" + e.getMessage());

			}
		}
		return flag;
	}
	public boolean updateEngineerDetails(EngineerVO vo) throws EngineerException
	{
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try{
			connection = DriverManager.getConnection(Url,userName,password);
			String query = "UPDATE Engineer set Engineer_Name =?,Engineer_Address =?, WHERE Engineer_id = ?";
			ps = connection.prepareStatement(query);
			ps.setString(2, vo.getEngineer_Name());
			ps.setInt(3, vo.getEngineer_Age());
			ps.setString(4, vo.getEngineer_Address());
			ps.setLong(5, vo.getEngineer_Mobile());
			ps.executeUpdate();
			flag = true;
				
			
		}catch (SQLException e){
			throw new EngineerException("Error when add the Engineer Details" + e.getMessage());
		}finally{
			try{
				ps.close();
				connection.close();
			}catch (SQLException e){
				throw new EngineerException("Error when add the Engineer Details" + e.getMessage());

			}
		}
		return flag;
		
	}
	public EngineerVO fetchEngineerById(int Engineer_id) throws EngineerNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		EngineerVO vo=new EngineerVO();
		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Engineer where Engineer_id= ?";
			ps=connection.prepareStatement(query);
			rs=ps.executeQuery(query);
			while(rs.next())
			{
				int Engineer_id1=rs.getInt("Engineer_id");
				String Engineer_name=rs.getString("Engineer_name");
				float Engineer_salary=rs.getFloat("Engineer_salary");
				System.out.println(Engineer_id1+" "+Engineer_name+"  "+Engineer_salary);
				
			}
		}
		catch(SQLException e)
		{
			throw new EngineerNotFoundException("Error when add the Engineer Details" + e.getMessage());
		}
		finally
		{
			try{
				ps.close();
				connection.close();
			}catch(SQLException e){
				throw new EngineerNotFoundException("Error when add the Engineer Details" + e.getMessage());

			}
		}
		return vo;
	}
	public List<EngineerVO> fetchEngineerByname(String Engineer_Name) throws EngineerNotFoundException
	{
		String userName="root";
		String password="root123";
		String url="jdbc:mysql://localhost:3306/cms";
		Connection connection=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		EngineerVO vo=new EngineerVO();
		List<EngineerVO> list = new ArrayList<EngineerVO>();
		try{
			connection=DriverManager.getConnection(url,userName,password);
			String query="select * from Engineer where Engineer_name?";
			stmt=connection.prepareStatement(query);
			rs=stmt.executeQuery(query);
			while(rs.next())
			{
				vo.setEngineer_Id(rs.getInt("Engineer_id"));
				vo.setEngineer_Name(rs.getString("Engineer_Name"));
				Integer Engineer_id=vo.getEngineer_Id();
			
			}
		}
		catch(SQLException e){
			throw new EngineerNotFoundException("Error when add the Engineer Details" + e.getMessage());
		}finally{
			try{
				stmt.close();
				connection.close();
			}catch(SQLException e){
				throw new EngineerNotFoundException("Error when add the Engineer Details" + e.getMessage());

			}
		}
		return list;

	}

}