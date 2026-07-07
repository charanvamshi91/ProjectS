package com.project.ProjectS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectS.model.BranchAdminDTO;
import com.project.ProjectS.repository.BranchAdminDAO;

@Service
public class BranchAdminService {
	@Autowired
    private  BranchAdminDAO branchAdminDAO;

    public void save(BranchAdminDTO dto) {
        branchAdminDAO.save(dto);
    }

    public List<BranchAdminDTO> findAll() {

        return branchAdminDAO.findAll();
    }

    public BranchAdminDTO findById(Integer id) {

        return branchAdminDAO.findById(id);
    }

    public void update(Integer id, BranchAdminDTO dto) {

        branchAdminDAO.update(id, dto);
    }
    public  void delete(Integer id) {

        branchAdminDAO.delete(id);
    }
}
