package com.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	public EmployeeDao() {
		// TODO Auto-generated constructor stub
	}
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		System.out.println("Asdfasd");
		
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public List<Employee> getEmployeesByRowMapper(){
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rownumber)
					throws SQLException {
				// TODO Auto-generated method stub
				System.out.println(rownumber);
				Employee e = new Employee();
				
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				
				
				return e;
			}
			
			
			
			
		});
	}
	
	

}
