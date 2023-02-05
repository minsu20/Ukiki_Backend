package com.example.Ukiki.domain.lecture.service;

import com.example.Ukiki.domain.lecture.dto.LectureDto.LectureResponse;

import java.util.List;

public interface LectureService {
    List<LectureResponse> GE(String GEselect);

    List<LectureResponse> major(String major);
}
