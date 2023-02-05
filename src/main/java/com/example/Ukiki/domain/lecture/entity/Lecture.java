package com.example.Ukiki.domain.lecture.entity;

import com.example.Ukiki.domain.emptyclassroom.entity.Classroom;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Lecture {

    @Id
    private Integer lectureId;
    private String curriculm;
    private String subjectCode;
    private String subjectName;
    private Integer credit;
    private String professorName;

    @JsonManagedReference
    @OneToMany(mappedBy = "lecture")
    private List<Classroom> classrooms=new ArrayList<>();
}
