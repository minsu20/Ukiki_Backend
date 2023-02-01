package com.example.Ukiki.emptyclassroom.controller;

import com.example.Ukiki.emptyclassroom.constant.EmptyClassroomConstants;
import com.example.Ukiki.emptyclassroom.constant.EmptyClassroomConstants.EEmptyClassroomResponseMessage;
import com.example.Ukiki.emptyclassroom.service.EmptyClassroomService;
import com.example.Ukiki.global.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("emptyroom")
public class EmptyClassroomController {
    private final EmptyClassroomService emptyClassroomService;

    @GetMapping("/{classroomName}")
    public ResponseEntity<ResponseDto<List<String>>> getEmptyRoomByName(@PathVariable String classroomName){
        return ResponseEntity.ok(ResponseDto.create( EEmptyClassroomResponseMessage.GET_BYNAME_EMPTYROOM_SUCCESS.getMessage(), this.emptyClassroomService.getEmptyRoomByName(classroomName)));
    }

    @GetMapping("/all")
    public ResponseEntity<ResponseDto<List<String>>> getAllEmptyRoom(){
        return ResponseEntity.ok(ResponseDto.create(EEmptyClassroomResponseMessage.GET_ALL_EMPTYROOM_SUCCESS.getMessage(), this.emptyClassroomService.getAllEmptyRoom()));
    }
}

