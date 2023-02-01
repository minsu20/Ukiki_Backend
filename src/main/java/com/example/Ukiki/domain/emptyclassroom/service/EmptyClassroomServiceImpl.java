package com.example.Ukiki.domain.emptyclassroom.service;

import com.example.Ukiki.domain.emptyclassroom.repository.AllClassroomRepository;
import com.example.Ukiki.domain.emptyclassroom.repository.EmptyClassroomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
