package com.project.ProjectS.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("section")
public class SectionDTO {

    @Id
    @Column("section_id")
    private Long sectionId;

    @Column("course_id")
    private Long courseId;

    @Column("section_name")
    private String sectionName;

    @Column("description")
    private String description;

    public SectionDTO() {
    }

    public SectionDTO(Long sectionId, Long courseId, String sectionName, String description) {
        this.sectionId = sectionId;
        this.courseId = courseId;
        this.sectionName = sectionName;
        this.description = description;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}