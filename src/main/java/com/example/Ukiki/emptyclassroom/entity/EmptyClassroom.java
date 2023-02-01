package com.example.Ukiki.emptyclassroom.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class EmptyClassroom {
    @Id
    private Integer id;
    private String dayOfWeek;
    private Double startTime;
    private Double endTime;
    private String place;
}
