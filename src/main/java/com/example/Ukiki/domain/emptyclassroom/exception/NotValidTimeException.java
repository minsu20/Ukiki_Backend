package com.example.Ukiki.domain.emptyclassroom.exception;

import static com.example.Ukiki.domain.emptyclassroom.constant.EmptyClassroomConstants.EmptyClassroomExceptionList.NOT_VALID_TIME;

public class NotValidTimeException extends EmptyClassroomException {

    public NotValidTimeException() {
        super(NOT_VALID_TIME.getErrorCode(),
                NOT_VALID_TIME.getHttpStatus(),
                NOT_VALID_TIME.getMessage());
    }
}

