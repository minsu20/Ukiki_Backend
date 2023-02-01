package com.example.Ukiki.emptyclassroom.repository;

import com.example.Ukiki.emptyclassroom.entity.AllClassroom;

import java.util.List;

public interface AllClassroomRepositoryCustom {
    List<String> getAllClassroomByName(String classroomName);
    List<String> getAllClassroom();
}
