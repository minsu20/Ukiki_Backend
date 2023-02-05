package com.example.Ukiki.domain.lecture.controller;

import com.example.Ukiki.domain.lecture.constant.LectureConstnats;
import com.example.Ukiki.domain.lecture.constant.LectureConstnats.ELectureResponseMessage;
import com.example.Ukiki.domain.lecture.dto.LectureDto;
import com.example.Ukiki.domain.lecture.dto.LectureDto.LectureResponse;
import com.example.Ukiki.domain.lecture.entity.Lecture;
import com.example.Ukiki.domain.lecture.service.LectureService;
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
@RequestMapping("lecture")
@Api(tags = "LECTURE API")
public class LectureController {
    //공통교양 검색하기
    //일반교양 검색하기
    //전공 학수번호로 검색하기
    private final LectureService lectureService;

    @ApiOperation(value = "교양과목 조회", notes = "개설된 강좌 중 교양과목을 조회합니다. 일반, 교양 중 하나를 선택하세요.")
    @GetMapping("/ge/{ge}")
    public ResponseEntity<ResponseDto<List<LectureResponse>>> getGE(@PathVariable String ge){
        return ResponseEntity.ok(ResponseDto.create(ELectureResponseMessage.GET_GE_SUCCESS.getMessage(), this.lectureService.GE(ge)));
    }

    @ApiOperation(value = "전공과목 조회", notes = "해당 과의 전공과목을 조회합니다.")
    @GetMapping("/major/{major}")
    public ResponseEntity<ResponseDto<List<LectureResponse>>> getMajor(@PathVariable String major){
        return ResponseEntity.ok(ResponseDto.create(ELectureResponseMessage.GET_MAJOR_SUCCESS.getMessage(), this.lectureService.major(major)));
    }
}
