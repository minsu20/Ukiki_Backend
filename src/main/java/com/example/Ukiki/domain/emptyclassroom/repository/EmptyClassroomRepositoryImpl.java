package com.example.Ukiki.domain.emptyclassroom.repository;

import com.example.Ukiki.domain.emptyclassroom.exception.NotValidDofException;
import com.example.Ukiki.domain.emptyclassroom.exception.NotValidTimeException;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import static com.example.Ukiki.domain.emptyclassroom.entity.QEmptyClassroom.emptyClassroom;

public class EmptyClassroomRepositoryImpl implements EmptyClassroomRepositoryCustom{
    private final JPAQueryFactory queryFactory;

    private final EntityManager em;

    public EmptyClassroomRepositoryImpl(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<String> getUsingClassroomByName(String classroomName){
        return queryFactory
                .select(emptyClassroom.place)
                .from(emptyClassroom)
                .where(emptyClassroom.place.eq(classroomName))
                .where(emptyClassroom.dayOfWeek.eq(getDayOfWeek()))
                .where(emptyClassroom.startTime.lt(getMyTime()))
                .where(emptyClassroom.endTime.gt(getMyTime()))
                .fetch();
    }

    @Override
    public List<String> getUsingClassroom(){
        return queryFactory
                .select(emptyClassroom.place)
                .from(emptyClassroom)
                .where(emptyClassroom.dayOfWeek.eq(getDayOfWeek()))
                .where(emptyClassroom.startTime.lt(getMyTime()))
                .where(emptyClassroom.endTime.gt(getMyTime()))
                .fetch();
    }


    private String getDayOfWeek() {
        LocalDate nowDate = LocalDate.now();
        DayOfWeek dayOfWeek = nowDate.getDayOfWeek();
        String nowDayOfWeek = dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.KOREAN);
        if(nowDayOfWeek.equals("토")||nowDayOfWeek.equals("일"))
            throw new NotValidDofException();
        return nowDayOfWeek;
    }

    private Double getMyTime() {
        LocalTime nowTime = LocalTime.now();
        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();
        double myTime = hour - 8 + minute / 60;
//        double myTime=2.5; test용
        if(myTime<0)
            throw new NotValidTimeException();
        return myTime;
    }
}
