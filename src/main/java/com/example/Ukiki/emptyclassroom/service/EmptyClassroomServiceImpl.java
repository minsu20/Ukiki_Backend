package com.example.Ukiki.emptyclassroom.service;

import com.example.Ukiki.emptyclassroom.entity.AllClassroom;
import com.example.Ukiki.emptyclassroom.entity.EmptyClassroom;
import com.example.Ukiki.emptyclassroom.repository.AllClassroomRepository;
import com.example.Ukiki.emptyclassroom.repository.EmptyClassroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

@Service
@Transactional
@RequiredArgsConstructor
public class EmptyClassroomServiceImpl implements EmptyClassroomService {
    private final EmptyClassroomRepository emptyClassroomRepository;
    private final AllClassroomRepository allClassroomRepository;

    @Override
    public List<String> getEmptyRoomByName(String classroomName) {
        List<String> allClassrooms = this.allClassroomRepository.getAllClassroomByName(classroomName);
        List<String> nowUsingClassrooms=this.emptyClassroomRepository.getUsingClassroomByName(classroomName);
        allClassrooms.removeAll(nowUsingClassrooms);
        return allClassrooms;
    }

    @Override
    public List<String> getAllEmptyRoom(){
        List<String> allClassrooms=this.allClassroomRepository.getAllClassroom();
        List<String> nowUsingClassrooms=this.emptyClassroomRepository.getUsingClassroom();
        allClassrooms.removeAll(nowUsingClassrooms);
        return allClassrooms;
    }

}
