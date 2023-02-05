package com.example.Ukiki.domain.lecture.repository;

import com.example.Ukiki.domain.lecture.dto.LectureDto.LectureResponse;

import java.util.List;

public interface LectureRepositoryCustom {
    List<LectureResponse> GE(String GEselect);
    List<LectureResponse> major(String major);
}
