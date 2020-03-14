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

import com.demo.execption.ClientException;
import com.demo.execption.ClientNotFoundException;
import com.demo.vo.ClientVO;

public class ClientDAO {
	public boolean addClientDetails(ClientVO vo) throws ClientException {
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try {
			connection = DriverManager.getConnection(Url, userName, password);
			String query = "INSERT INTO Client_info (Client_id,Client_Name,Client_Age,Client_Address,Client_mobile)VALUES(?,?,?,?,?)";
			ps = connection.prepareStatement(query);
			int i = ps.executeUpdate(query);
			flag = true;
		} catch (SQLException e) {
			throw new ClientException("Error when add the client Details" + e.getMessage());
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				throw new ClientException("Error when add the client Details" + e.getMessage());

			}
		}
		return flag;
	}

	public boolean updateClientDetails(ClientVO vo) throws ClientException {
		String userName = "root";
		String password = "root123";
		String Url = "jdbc:mysql://localhost:3306/cms";

		Connection connection = null;
		PreparedStatement ps = null;
		boolean flag;
		try {
			connection = DriverManager.getConnection(Url, userName, password);
			String query = "UPDATE client_info set Client_Name =?,Client_Address =?, WHERE Client_id = ?";
			ps = connection.prepareStatement(query);
			ps.setString(1, vo.getClient_Name());
			ps.setString(2, vo.getClient_Address());
			ps.setInt(3, vo.getClient_id());
			ps.executeUpdate();
			flag = true;

		} catch (SQLException e) {
			throw new ClientException("Error when add the client Details" + e.getMessage());
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				throw new ClientException("Error when add the client Details" + e.getMessage());

			}
		}
		return flag;

	}

	public ClientVO fetchClientById(int client_id) throws ClientNotFoundException {
		String userName = "root";
		String password = "root123";
		String url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ClientVO vo = new ClientVO();
		try {
			connection = DriverManager.getConnection(url, userName, password);
			String query = "select * from Engineer where Engineer_id?";
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery(query);
			while (rs.next()) {
				int client_id1 = rs.getInt("client_id");
				String client_name = rs.getString("client_name");
				System.out.println(client_id1 + " " + client_name);

			}
		} catch (SQLException e) {
			throw new ClientNotFoundException("Error when add the client Details" + e.getMessage());
		} finally {
			try {
				ps.close();
				connection.close();
			} catch (SQLException e) {
				throw new ClientNotFoundException("Error when add the Engineer Details" + e.getMessage());

			}
		}
		return vo;
	}

	public List<ClientVO> fetchClientByName(String Client_Name) throws ClientNotFoundException {
		String userName = "root";
		String password = "root123";
		String url = "jdbc:mysql://localhost:3306/cms";
		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ClientVO vo = new ClientVO();
		List<ClientVO> list = new ArrayList<ClientVO>();
		try {
			connection = DriverManager.getConnection(url, userName, password);
			String query = "select * from Client_info where Client_Name?";
			stmt = connection.prepareStatement(query);
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				vo.setClient_id(rs.getInt("Client_id"));
				vo.setClient_Name(rs.getString("Engineer_name"));
				Integer Client_id = vo.getClient_id();
		
			}
		} catch (SQLException e) {
			throw new ClientNotFoundException("Error when add the client Details" + e.getMessage());
		} finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				throw new ClientNotFoundException("Error when add the client Details" + e.getMessage());

			}
		}
		return list;
	
	}

}
