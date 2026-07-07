package com.project.ProjectS.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.ProjectS.model.BranchAdminDTO;
import com.project.ProjectS.model.SuperAdminDTO;
@Repository
public class BranchAdminDAO {
	@Autowired
	   private JdbcTemplate jdbcTemplate;
	
	public int  save(BranchAdminDTO dto) {
		String sql = "INSERT INTO branch_admin "
		        + "(name, designation, address, employee_id, email, phone_number, password, role_id) "
		        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
		return jdbcTemplate.update(sql,
             dto.getName(),
             dto.getDesignation(),
             dto.getAddress(),
             dto.getEmployeeId(),
             dto.getEmail(),
             dto.getPhoneNumber(),
             dto.getPassword(),
             dto.getRoleId());
	
		
	}
	
	    public List<BranchAdminDTO> findAll() {

	        String sql = "SELECT * FROM branch_admin ORDER BY branch_admin_id";

	        return jdbcTemplate.query(
	                sql,
	                new BeanPropertyRowMapper<>(BranchAdminDTO.class));
	    }

	 
	    public BranchAdminDTO findById(Integer id) {

	        String sql = "SELECT * FROM branch_admin WHERE branch_admin_id=?";

	        return jdbcTemplate.queryForObject(
	                sql,
	                new BeanPropertyRowMapper<>(BranchAdminDTO.class),
	                id);
	    }

	    
	    public int update(Integer id, BranchAdminDTO dto) {

	    	String sql = "UPDATE branch_admin SET "
	    	        + "name=?, "
	    	        + "designation=?, "
	    	        + "address=?, "
	    	        + "employee_id=?, "
	    	        + "email=?, "
	    	        + "phone_number=?, "
	    	        + "password=?, "
	    	        + "role_id=? "
	    	        + "WHERE branch_admin_id=?";

	        return jdbcTemplate.update(sql,
	                dto.getName(),
	                dto.getDesignation(),
	                dto.getAddress(),
	                dto.getEmployeeId(),
	                dto.getEmail(),
	                dto.getPhoneNumber(),
	                dto.getPassword(),
	                dto.getRoleId(),
	                id);
	    }

	
	    public int delete(Integer id) {

	    String sql ="	DELETE FROM branch_admin WHERE branch_admin_id=?";

	        return jdbcTemplate.update(sql, id);
	    }
}

