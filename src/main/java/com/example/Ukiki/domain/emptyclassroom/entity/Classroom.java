package com.example.Ukiki.domain.emptyclassroom.entity;

import com.example.Ukiki.domain.lecture.entity.Lecture;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Classroom {
    @Id
    private Integer id;
    private String dayOfWeek;
    private Double startTime;
    private Double endTime;
    private String place;

    @JsonBackReference
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="lecture_id")
    private Lecture lecture;

    /**
     * 연관관계 매핑
     */
    public void setLecture(Lecture lecture){
        this.lecture=lecture;
        lecture.getClassrooms().add(this);
    }
}
