package com.example.Ukiki.domain.emptyclassroom.repository;

import java.util.List;

public interface AllClassroomRepositoryCustom {
    List<String> getAllClassroomByName(String classroomName);
    List<String> getAllClassroom();
}
