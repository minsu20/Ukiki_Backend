package com.example.Ukiki.emptyclassroom.exception;

import com.example.Ukiki.emptyclassroom.constant.EmptyClassroomConstants;

import static com.example.Ukiki.emptyclassroom.constant.EmptyClassroomConstants.EmptyClassroomExceptionList.NOT_VALID_TIME;

public class NotValidTimeException extends EmptyClassroomException {

    public NotValidTimeException() {
        super(NOT_VALID_TIME.getErrorCode(),
                NOT_VALID_TIME.getHttpStatus(),
                NOT_VALID_TIME.getMessage());
    }
}

