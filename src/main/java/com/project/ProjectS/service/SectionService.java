package com.project.ProjectS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectS.model.SectionDTO;
import com.project.ProjectS.repository.SectionDAO;

@Service
public class SectionService {

    @Autowired
    private SectionDAO sectionDAO;

    public SectionDTO saveSection(SectionDTO section) {
        return sectionDAO.save(section);
    }

    public Iterable<SectionDTO> getAllSections() {
        return sectionDAO.findAll();
    }

    public SectionDTO getSectionById(Long id) {
        return sectionDAO.findById(id).orElse(null);
    }

    public SectionDTO updateSection(SectionDTO section) {
        return sectionDAO.save(section);
    }

    public void deleteSection(Long id) {
        sectionDAO.deleteById(id);
    }
}