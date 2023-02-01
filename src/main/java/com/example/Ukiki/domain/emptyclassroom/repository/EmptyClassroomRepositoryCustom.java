package com.example.Ukiki.domain.emptyclassroom.repository;

import java.util.List;

public interface EmptyClassroomRepositoryCustom {
    List<String> getUsingClassroomByName(String classroomName);
    List<String> getUsingClassroom();
}
