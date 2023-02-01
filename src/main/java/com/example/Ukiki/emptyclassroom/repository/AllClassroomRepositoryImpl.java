package com.example.Ukiki.emptyclassroom.repository;

import com.example.Ukiki.emptyclassroom.entity.AllClassroom;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import java.util.List;

import static com.example.Ukiki.emptyclassroom.entity.QAllClassroom.allClassroom;

public class AllClassroomRepositoryImpl implements AllClassroomRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    private final EntityManager em;

    public AllClassroomRepositoryImpl(EntityManager em) {
        this.em = em;
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<String> getAllClassroomByName(String classroomName) {
        return queryFactory
                .select(allClassroom.place)
                .from(allClassroom)
                .where(allClassroom.place.contains(classroomName))
                .fetch();
    }

    @Override
    public List<String> getAllClassroom() {
        return queryFactory
                .select(allClassroom.place)
                .from(allClassroom)
                .fetch();
    }
}
