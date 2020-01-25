package com.NamedParameterJdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployeeDao {
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public EmployeeDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		// TODO Auto-generated constructor stub
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
		
	}
	
	@SuppressWarnings("unchecked")
	public void save(Employee employee){
		String query = "insert into employee values (:id,:name,:salary)";
		
		
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("id", employee.getId());
		map.put("name", employee.getName());
		map.put("salary", employee.getSalary());
		
		namedParameterJdbcTemplate.execute(query,map , new PreparedStatementCallback<Object>() {

			@Override
			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				return ps.executeUpdate();
			}
		});
		
		

	
	}
	
	
	
	
	
	
	
	

}
