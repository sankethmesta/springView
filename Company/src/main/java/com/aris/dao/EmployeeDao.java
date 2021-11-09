package com.aris.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.aris.beans.ArisEmployee;
import com.aris.beans.PatientDetails;

public class EmployeeDao {
	JdbcTemplate template;


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(ArisEmployee emp) {
		String sql="insert into arisemployee values ("+emp.getId()+",'"+emp.getName()+"','"+emp.getDepartment()+"',"+emp.getSalary()+")";
		return template.update(sql);
	}
	public PatientDetails getDOC_ID(String DOC_ID) {
		  String view="SELECT * FROM REQUEST WHERE DOC_ID=?";
		  return template.queryForObject(view, new Object[] {DOC_ID}, new BeanPropertyRowMapper<PatientDetails>(PatientDetails.class));
		 }
		 public List<PatientDetails> getPatient(){    
		  return template.query("SELECT * FROM REQUEST",new RowMapper<PatientDetails>(){    
		   public PatientDetails mapRow(ResultSet rs, int row) throws SQLException {    
		    PatientDetails e=new PatientDetails();  
		    e.setDOC_ID(rs.getString(1));
		    e.setPAT_ID(rs.getInt(2));
		    e.setDATE_OF_REQUEST(rs.getString(3));
		    e.setDATE_OF_APPOINTMENT(rs.getString(4));
		    e.setPATIENT_CONTACT(rs.getInt(5));
		    return e;
		   }    
		  });    
		 }

}
