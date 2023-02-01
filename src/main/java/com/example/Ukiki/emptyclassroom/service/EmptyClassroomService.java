package com.example.Ukiki.emptyclassroom.service;

import com.example.Ukiki.emptyclassroom.entity.EmptyClassroom;

import java.util.List;

public interface EmptyClassroomService {
    List<String> getEmptyRoomByName(String classroomName);
    List<String> getAllEmptyRoom();
}
