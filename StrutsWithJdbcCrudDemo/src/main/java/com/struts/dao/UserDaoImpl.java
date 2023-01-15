package com.struts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.struts.dbconfig.ConnectionProvider;
import com.struts.models.User;

public class UserDaoImpl implements UserDao {

	@Override
	public int registerUser(User user) {
		int i = 0;
		try {
			String sql = "INSERT INTO user(name,city,salary,email) VALUES (?,?,?,?)";
			PreparedStatement ps = ConnectionProvider.getConnection().prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getCity());
			ps.setString(3, user.getSalary());
			ps.setString(4, user.getEmail());

			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		}
	}

	@Override
	public int deleteUserDetails(Long id) {
		int i = 0;
		try {
			String sql = "DELETE FROM User WHERE id=?";
			PreparedStatement ps = ConnectionProvider.getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int updateUserDetails(User user) {
		int i = 0;
		try {
			String sql = "UPDATE user SET name=?,city=?,salary=?,email=? where id=?";
			PreparedStatement ps = ConnectionProvider.getConnection().prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setString(2, user.getCity());
			ps.setString(3, user.getSalary());
			ps.setString(4, user.getEmail());
			ps.setLong(5, user.getId());
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public User fetchUserDetails(Long id) {
		User user = null;
		try {
			String sql = "SELECT id,name,city,salary,email FROM user WHERE id=?";
			PreparedStatement ps = ConnectionProvider.getConnection().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Long userId = rs.getLong("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String salary = rs.getString("salary");
				String city = rs.getString("city");
				user = new User(userId, name, city, salary, email);
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> report() {
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<User> users = new ArrayList<>();
		// Step 1: Establishing a Connection
		try {
			Connection connection = ConnectionProvider.getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String salary = rs.getString("salary");
				String city = rs.getString("city");
				users.add(new User(id, name, city, salary, email));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	public static void main(String[] args) {
		System.out.println(new UserDaoImpl().report());
	}

}
