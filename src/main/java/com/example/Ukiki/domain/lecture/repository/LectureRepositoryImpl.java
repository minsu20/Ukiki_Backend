package com.example.Ukiki.domain.lecture.repository;

import com.example.Ukiki.domain.lecture.dto.LectureDto.LectureResponse;
import com.example.Ukiki.domain.lecture.entity.Lecture;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.Ukiki.domain.emptyclassroom.entity.QClassroom.classroom;
import static com.example.Ukiki.domain.lecture.entity.QLecture.lecture;


public class LectureRepositoryImpl implements LectureRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    private final EntityManager em;

    public LectureRepositoryImpl(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<LectureResponse> GE(String GEselect){
        List<Lecture> content= queryFactory
                .select(lecture)
                .from(lecture)
                .join(lecture.classrooms, classroom)
                .where(lecture.curriculm.contains("교양"))
                .where(lecture.curriculm.contains(GEselect))
                .fetch();

        return content.stream()
                .map(p->new LectureResponse(p.getLectureId(), p.getCurriculm(), p.getSubjectCode(),p.getSubjectName(),p.getCredit(),p.getProfessorName(),p.getClassrooms()))
                .collect(Collectors.toList());
    }

    @Override
    public List<LectureResponse> major(String major){
        List<Lecture> content=  queryFactory
                .select(lecture)
                .from(lecture)
                .join(lecture.classrooms, classroom)
                .where(lecture.curriculm.contains("전공"))
                .where(lecture.subjectCode.contains(major))
                .fetch();

        return content.stream()
                .map(p->new LectureResponse(p.getLectureId(), p.getCurriculm(), p.getSubjectCode(),p.getSubjectName(),p.getCredit(),p.getProfessorName(),p.getClassrooms()))
                .collect(Collectors.toList());
    }
}
