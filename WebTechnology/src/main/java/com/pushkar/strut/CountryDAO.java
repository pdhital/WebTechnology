package com.pushkar.strut;

import java.sql.*;

import org.apache.log4j.Logger;

public class CountryDAO {
	private static Logger log = Logger.getLogger(CountryDAO.class);
	
	static Connection con  = null;
	static Statement stm = null;
	static PreparedStatement pstm = null;
	CallableStatement cs = null;
	ResultSet rs = null;
	
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/country";
	
	private void loadDriver() throws ClassNotFoundException{
		try{
			Class.forName(JDBC_DRIVER);
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
			log.error("Issues in class not found" + exp.getMessage());
			throw exp;
		}
		
	}
	
	private Connection getConnection(){
		try {
			con = DriverManager.getConnection(DB_URL, "root", "admin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void lookUpInfo(String countryName) throws Exception , ClassNotFoundException{
		try {
			loadDriver();
			
			con = getConnection();
			con.setAutoCommit(false);
			
			pstm = con.prepareStatement("select * from country where name=Aruba");
			
		} catch (ClassNotFoundException cnfe) {
			throw cnfe;
			
		}catch(Exception exp){
			exp.printStackTrace();
			
			try {
				if(con != null){
					con.rollback();
				}
			} catch (Exception exp1) {
				throw exp1;
			}
			throw exp;
		}finally{
			closeConnections(rs, stm, con);
		}
		
	}
	
	private void closeConnections(ResultSet rs , Statement stmt , Connection con){
		try{
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}

}
