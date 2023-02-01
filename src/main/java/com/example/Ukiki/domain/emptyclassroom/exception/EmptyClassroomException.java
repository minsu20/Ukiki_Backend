package com.example.Ukiki.domain.emptyclassroom.exception;

import com.example.Ukiki.global.exception.ApplicationException;
import org.springframework.http.HttpStatus;

public abstract class EmptyClassroomException extends ApplicationException {
    protected EmptyClassroomException(String errorcode, HttpStatus httpStatus, String message){
        super(errorcode, httpStatus, message);
    }
}
