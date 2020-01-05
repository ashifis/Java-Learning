package com.RestFul26.DemoRest26;


import java.util.ArrayList;
import java.util.LinkedList;
import java.sql.*;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

public class AliensRepository {
	
	Connection con = null;
	
	
	public AliensRepository() {
		System.out.println("Check123");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "jh";
		String pass = "12345";
		try {
			
			try {
				//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
				Class.forName("oracle.jdbc.OracleDriver"); 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 con=DriverManager.getConnection("jdbc:oracle:thin:@ASHIFS:1521:XE","jh","jh");  
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		
	}
	public List<Alien> getAliens(int minId, int maxId){
		System.out.println("getAliens()");
		List<Alien> aliens= new ArrayList<Alien>();
		String statement  = "SELECT ID , FIRST_NAME,POINTS,LAST_NAME,DOMAIN,SYS_CREATION_DATE ,SYS_UPDATE_DATE, CITY"
				+ " FROM ALIEN Where id BETWEEN ? AND ? ORDER BY ID ASC";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(statement);
			ResultSet rs = null;
			ps.setInt(1, minId);
			ps.setInt(2, maxId);
			rs = ps.executeQuery();
			
			
			while(rs.next()) {
				Alien a = new Alien();
				
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoint(rs.getInt(3));
				a.setLname(rs.getString(4));
				a.setDomain(rs.getString(5));
				a.setCreationDate(rs.getTimestamp(6));
				a.setUpdateDate(rs.getTimestamp(7));
				a.setCity(rs.getString(8));
				System.out.println(a);
				aliens.add(a);
			
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		
		if(!aliens.isEmpty()) {
			return aliens;
		}else {
			Alien al = new Alien();
			al.setName("No valid Alien in the range("+minId+","+maxId+")");
			aliens.add(al);
			return aliens;}
		
		
	}
	
	public Alien getAlien(int id) {
		System.out.println("getAlien");
		String statement  = "SELECT ID , FIRST_NAME,POINTS,LAST_NAME,DOMAIN,SYS_CREATION_DATE,SYS_UPDATE_DATE,CITY FROM ALIEN";
		PreparedStatement ps;
		Alien alien = new Alien();
		try {
			ps = con.prepareStatement(statement);
			ResultSet rs = null;
			rs = ps.executeQuery();
			
			System.out.println(rs);
			while(rs.next()) {
				
				System.out.println("Looking for id: "+id);
				System.out.println("Traversed for id: "+ rs.getInt(1));
				if (id == rs.getInt(1)) {
					//System.out.println("Traversed for id: "+ rs.getInt(1));
					alien.setId(rs.getInt(1));
					alien.setName(rs.getString(2));
					alien.setPoint(rs.getInt(3));
					alien.setLname(rs.getString(4));
					alien.setDomain(rs.getString(5));
					
					alien.setCreationDate(rs.getTimestamp(6));
					alien.setUpdateDate(rs.getTimestamp(7));
					alien.setCity(rs.getString(8));
					return alien;
				}
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alien.setName("Could not find Alien for ID "+id);
		return alien;	
	}
	
	public Alien  createAlien(Alien alien) {
		
		System.out.println("createAlien");
		String statement  = "INSERT INTO ALIEN (POINTS, FIRST_NAME , id ,SYS_CREATION_DATE,LAST_NAME,DOMAIN) "+
		"VALUES (?, ? , (select max(id)+1 from alien),SYSDATE,?,?)";
		Alien alien1 = new Alien();
		alien1 = alien;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(statement);
			System.out.println(" alien.getPoint()" +  alien.getPoint());
			ps.setInt(1, alien.getPoint());
			ps.setString(2, alien.getName().toUpperCase());
			ps.setString(3, alien.getLname().toUpperCase());
			ps.setString(4, alien.getDomain().toUpperCase());
			
			int rs ;
			rs = ps.executeUpdate();
			alien1.setInsertStatus(rs);
			System.out.println(rs);
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return alien1;
		
		
		
	}
	
	public Boolean aienExists(int id) {
		System.out.println("getAlien");
		String statement  = "SELECT ID , FIRST_NAME,POINTS FROM ALIEN";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(statement);
			ResultSet rs = null;
			rs = ps.executeQuery();
			
			System.out.println(rs);
			while(rs.next()) {
				Alien alien = new Alien();
				//System.out.println("Looking for id: "+id);
				//System.out.println("Traversed for id: "+ rs.getInt(1));
				if (id == rs.getInt(1)) {
					//System.out.println("Traversed for id: "+ rs.getInt(1));
					alien.setId(rs.getInt(1));
					alien.setName(rs.getString(2));
					alien.setPoint(rs.getInt(3));
					System.out.println(alien);

					System.out.println("Alien exists");
					return true;
				}
				
			}
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("Alien does not exists");
		return false;
		
	}
	public Alien updateAlien(Alien alien) {
		// TODO Auto-generated method stub
		System.out.println("updateAlien");
		Alien alien1 = new Alien();
		alien1 = alien;
		
		
		AliensRepository aRepo = new AliensRepository();
		if (aRepo.aienExists(alien.getId())) {
			
			String statement  = "UPDATE  ALIEN SET POINTS = ? , FIRST_NAME = ? ,LAST_NAME = ?, DOMAIN = ? ,SYS_UPDATE_DATE=SYSDATE"
					+ " WHERE ID = ?";
			PreparedStatement ps;
			try {
				ps = con.prepareStatement(statement);
				System.out.println(" alien.getPoint()" +  alien.getPoint());
				ps.setInt(1, alien.getPoint());
				ps.setString(2, alien.getName().toUpperCase());
				
				ps.setString(3, alien.getLname().toUpperCase());
				ps.setString(4, alien.getDomain());
				
				ps.setInt(5, alien.getId());
				int rs ;
				rs = ps.executeUpdate();
				alien1.setInsertStatus(rs);
				System.out.println(rs);
				
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return alien;
			
			
		}
		
		return alien1;
	}
	public Alien killAlien(int id) {
		// TODO Auto-generated method stub
		Alien alien1 = new Alien();
		alien1.setId(id);
		
		
		alien1.setName("Alien Does not exists...");
		AliensRepository aRepo = new AliensRepository();
		if (aRepo.aienExists(alien1.getId())) {
			
			String statement  = "DELETE  ALIEN  WHERE ID = ?";
			PreparedStatement ps;
			try {
				ps = con.prepareStatement(statement);
				System.out.println(" alien.getId()" +  alien1.getId());
		
				ps.setInt(1, alien1.getId());
				int rs ;
				rs = ps.executeUpdate();
				alien1.setInsertStatus(rs);
				if(rs == 1) {
					alien1.setName("Alien Deleted");
				}
				else {
					
				}
				System.out.println(rs);
				
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return alien1;
			
			
		}
		
		return alien1;
	}
	public List<Alien> getAlienByName(String lname) {
		List<Alien> alienByLastName = new ArrayList<Alien>();
		System.out.println("getAlienByName");
		String statement  = "SELECT ID , FIRST_NAME, LAST_NAME, POINTS, DOMAIN ,SYS_CREATION_DATE,SYS_UPDATE_DATE"
				+ " FROM ALIEN";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(statement);
			ResultSet rs = null;
			rs = ps.executeQuery();
			
			System.out.println(rs);
			//rs.next();
			while(rs.next()) {
				System.out.println(lname.toUpperCase());
				String lnameToFind = rs.getString(3)==null?"NULL":rs.getString(3);
				System.out.println("lnameToFind"+lnameToFind);
				
				if (lname.toUpperCase().equals(lnameToFind.toUpperCase()) ) {
					System.out.println("Looking for Last Name: "+lname);
					System.out.println("Traversed for id: "+ rs.getString(3));
					Alien alien = new Alien();
					alien.setId(rs.getInt(1));
					alien.setName(rs.getString(2));
					alien.setLname(rs.getString(3));
					alien.setPoint(rs.getInt(4));
					alien.setDomain(rs.getString(5));
					alien.setCreationDate(rs.getTimestamp(6));
					alien.setUpdateDate(rs.getTimestamp(7));
					System.out.println(alien);
					alienByLastName.add(alien);
				}
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!alienByLastName.isEmpty()) {
			return alienByLastName;
		}else {
			Alien al = new Alien();
			alienByLastName.add(al);
			return alienByLastName;
			
		}
		
			
	
	
		
		
		
	}
	public List<Alien> getAlienByNamesDomain(String fname, String lname, String domain) {
		// TODO Auto-generated method stub
		List<Alien> alienByLastName = new ArrayList<Alien>();
		System.out.println("getAlienByNamesDomain");
		String statement  = "SELECT ID , FIRST_NAME, LAST_NAME, POINTS, DOMAIN,SYS_CREATION_DATE , SYS_UPDATE_DATE"
				+ " FROM ALIEN";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(statement);
			ResultSet rs = null;
			rs = ps.executeQuery();
			
			System.out.println(rs);
			//rs.next();
			while(rs.next()) {
				System.out.println(fname.toUpperCase());
				System.out.println(domain.toUpperCase());
				System.out.println(domain.toUpperCase());
				String fnameToFind = rs.getString(2)==null?"NULL":rs.getString(2);
				String lnameToFind = rs.getString(3)==null?"NULL":rs.getString(3);
				String domainToFind = rs.getString(5)==null?"NULL":rs.getString(5);
				
				System.out.println("No Match for  : "+fnameToFind+"."+lnameToFind+"@"+domainToFind);
				if (lname.toUpperCase().equals(lnameToFind.toUpperCase()) &&
						fname.toUpperCase().equals(fnameToFind.toUpperCase()) &&
						domain.toUpperCase().equals(domainToFind.toUpperCase())) {
					System.out.println("Looking for  : "+fname+"."+lname+"@"+domain);
					System.out.println("Matched for  : "+fnameToFind+"."+lnameToFind+"@"+domainToFind);
					Alien alien = new Alien();
					alien.setId(rs.getInt(1));
					alien.setName(rs.getString(2));
					alien.setLname(rs.getString(3));
					alien.setPoint(rs.getInt(4));
					alien.setDomain(rs.getString(5));
					alien.setCreationDate(rs.getTimestamp(6));
					alien.setUpdateDate(rs.getTimestamp(7));
					System.out.println(alien);
					alienByLastName.add(alien);
				}
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!alienByLastName.isEmpty()) {
			return alienByLastName;
		}else {
			Alien al = new Alien();
			alienByLastName.add(al);
			return alienByLastName;
		
	}
	
	
	}
	
	public Alien updateAlienCity(int id,String friendfname,String frienddomain,String friendcity) {
		
		// TODO Auto-generated method stub
				System.out.println("updateAlienCity");
				Alien alien = new Alien();
				alien.setName("Alien does not exist");
				alien.setId(id);
				if (aienExists(alien.getId())) {
					String statement  = "UPDATE  ALIEN SET CITY = ? ,SYS_UPDATE_DATE=SYSDATE"
							+ " WHERE ID = ? AND FIRST_NAME = ? AND DOMAIN = ?";
					PreparedStatement ps;
					try {
						
						alien.setId(id);
						alien.setName(friendfname);
						alien.setDomain(frienddomain);
						alien.setCity(friendcity);
						System.out.println(alien);
						ps = con.prepareStatement(statement);
						ps.setString(1, friendcity.toUpperCase());
						ps.setInt(2, alien.getId());
						ps.setString(3, alien.getName().toUpperCase());
						ps.setString(4, alien.getDomain().toUpperCase());
						int rs ;
						rs = ps.executeUpdate();
						alien.setInsertStatus(rs);
						System.out.println(rs);
						
					}catch (SQLException e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					return alien;
					
					
				}
		
		return alien;
	}
	

}
