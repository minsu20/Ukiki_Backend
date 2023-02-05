package com.example.Ukiki.domain.lecture.service;

import com.example.Ukiki.domain.lecture.dto.LectureDto.LectureResponse;
import com.example.Ukiki.domain.lecture.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class LectureServiceImpl implements LectureService{
    private final LectureRepository lectureRepository;

    @Override
    public List<LectureResponse> GE(String GEselect){
        return this.lectureRepository.GE(GEselect);
    }

    @Override
    public List<LectureResponse> major(String major){
        return this.lectureRepository.major(major);
    }
}
