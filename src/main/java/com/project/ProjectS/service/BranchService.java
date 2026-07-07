package com.project.ProjectS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectS.model.BranchDTO;
import com.project.ProjectS.repository.BranchDAO;

@Service
public class BranchService {

    @Autowired
    private BranchDAO branchDAO;

    // Save Branch
    public BranchDTO saveBranch(BranchDTO branch) {
        return branchDAO.save(branch);
    }

    // Get All Branches
    public Iterable<BranchDTO> getAllBranches() {
        return branchDAO.findAll();
    }

    // Get Branch By Id
    public BranchDTO getBranchById(Long id) {
        return branchDAO.findById(id).orElse(null);
    }

    // Update Branch
    public BranchDTO updateBranch(BranchDTO branch) {
        return branchDAO.save(branch);
    }

    // Delete Branch
    public void deleteBranch(Long id) {
        branchDAO.deleteById(id);
    }
}