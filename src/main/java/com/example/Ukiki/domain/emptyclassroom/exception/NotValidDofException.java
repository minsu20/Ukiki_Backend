package com.example.Ukiki.domain.emptyclassroom.exception;

import static com.example.Ukiki.domain.emptyclassroom.constant.EmptyClassroomConstants.EmptyClassroomExceptionList.NOT_VALID_DOF;

public class NotValidDofException extends EmptyClassroomException{

    public NotValidDofException(){
        super(NOT_VALID_DOF.getErrorCode(),
                NOT_VALID_DOF.getHttpStatus(),
                NOT_VALID_DOF.getMessage());
    }
}
