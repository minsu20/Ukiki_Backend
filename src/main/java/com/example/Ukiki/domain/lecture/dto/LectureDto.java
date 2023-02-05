package com.example.Ukiki.domain.lecture.dto;

import com.example.Ukiki.domain.emptyclassroom.entity.Classroom;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

public abstract class LectureDto {
    @Getter
    @AllArgsConstructor
    @Builder
    @ApiModel(description = "개설된 강좌 조회를 위한 응답 객체")
    public static class LectureResponse{
        private Integer lectureId;
        private String curriculm;
        private String subjectCode;
        private String subjectName;
        private Integer credit;
        private String professorName;
        private  List<Classroom> classrooms;
    }
}
