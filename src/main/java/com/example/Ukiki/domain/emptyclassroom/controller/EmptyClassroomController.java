package com.example.Ukiki.domain.emptyclassroom.controller;

import com.example.Ukiki.domain.emptyclassroom.constant.EmptyClassroomConstants.EEmptyClassroomResponseMessage;
import com.example.Ukiki.domain.emptyclassroom.service.EmptyClassroomService;
import com.example.Ukiki.global.dto.ResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "EMPTYROOM API")
public class EmptyClassroomController {
    private final EmptyClassroomService emptyClassroomService;

    @ApiOperation(value = "특정 건물의 빈 강의실 조회", notes = "해당 건물의 빈 강의실을 조회합니다.")
    @GetMapping("/{classroomName}")
    public ResponseEntity<ResponseDto<List<String>>> getEmptyRoomByName(@PathVariable String classroomName){
        return ResponseEntity.ok(ResponseDto.create( EEmptyClassroomResponseMessage.GET_BYNAME_EMPTYROOM_SUCCESS.getMessage(), this.emptyClassroomService.getEmptyRoomByName(classroomName)));
    }

    @ApiOperation(value = "전체 빈 강의실 조회", notes = "전체 빈 강의실을 조회합니다.")
    @GetMapping("/all")
    public ResponseEntity<ResponseDto<List<String>>> getAllEmptyRoom(){
        return ResponseEntity.ok(ResponseDto.create(EEmptyClassroomResponseMessage.GET_ALL_EMPTYROOM_SUCCESS.getMessage(), this.emptyClassroomService.getAllEmptyRoom()));
    }
}

