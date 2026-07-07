package com.project.ProjectS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectS.model.BranchAdminDTO;
import com.project.ProjectS.service.BranchAdminService;


@RestController
@RequestMapping("/api/branch-admin")
public class BranchAdminController {
	    @Autowired
	    private BranchAdminService branchAdminService;

	  
	    @PostMapping
	    public ResponseEntity<String> save(@RequestBody BranchAdminDTO dto) {
	    	 branchAdminService.save(dto);
	    	 return new ResponseEntity<>("User saved successfully", HttpStatus.CREATED);
	    }

	    
	    @GetMapping
	    public ResponseEntity<List<BranchAdminDTO>> findAll() {

	        List<BranchAdminDTO> list = branchAdminService.findAll();
	        return ResponseEntity.ok(list);
	    }


	    @GetMapping("/{id}")
	    public ResponseEntity<BranchAdminDTO> findById(@PathVariable Integer id) {

	        BranchAdminDTO dto = branchAdminService.findById(id);
	        return ResponseEntity.ok(dto);
	    }

	  
	    @PutMapping("/{id}")
	    public ResponseEntity<String> update(@PathVariable Integer id,
	                                         @RequestBody BranchAdminDTO dto) {

	        branchAdminService.update(id, dto);
	        return ResponseEntity.ok("User updated successfully");
	    }

	   
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> delete(@PathVariable Integer id) {

	       branchAdminService.delete(id);
	        return ResponseEntity.ok("Super Admin deleted successfully.");
	    }
}
