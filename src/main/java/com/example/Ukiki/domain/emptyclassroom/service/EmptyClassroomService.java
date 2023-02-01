package com.example.Ukiki.domain.emptyclassroom.service;

import java.util.List;

public interface EmptyClassroomService {
    List<String> getEmptyRoomByName(String classroomName);
    List<String> getAllEmptyRoom();
}
