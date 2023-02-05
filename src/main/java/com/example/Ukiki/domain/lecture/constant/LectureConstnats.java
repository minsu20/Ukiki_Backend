package com.example.Ukiki.domain.lecture.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class LectureConstnats {
    @Getter
    @RequiredArgsConstructor
    public enum ELectureResponseMessage{
        GET_GE_SUCCESS("교양 과목을 조회했습니다."),
        GET_MAJOR_SUCCESS("전공 과목을 조회했습니다.");
        private final String message;
    }
}
