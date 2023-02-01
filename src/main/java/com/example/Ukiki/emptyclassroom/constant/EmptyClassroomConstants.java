package com.example.Ukiki.emptyclassroom.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

public class EmptyClassroomConstants {

    @Getter
    @RequiredArgsConstructor
    public enum EEmptyClassroomResponseMessage{
        GET_ALL_EMPTYROOM_SUCCESS("모든 비어있는 강의실을 조회했습니다."),
        GET_BYNAME_EMPTYROOM_SUCCESS("해당 건물의 비어있는 강의실을 조회했습니다.");
        private final String message;
    }

    @Getter
    @RequiredArgsConstructor
    public enum EmptyClassroomExceptionList {
        NOT_VALID_TIME("E0001", HttpStatus.BAD_REQUEST, "오전 8시부터 가능합니다."),
        NOT_VALID_DOF("E0002",HttpStatus.BAD_REQUEST,"평일에만 가능합니다.");
        private final String errorCode;
        private final HttpStatus httpStatus;
        private final String message;
    }

}
