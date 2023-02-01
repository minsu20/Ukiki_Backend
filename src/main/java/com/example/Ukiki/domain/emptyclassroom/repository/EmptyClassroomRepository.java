package com.example.Ukiki.domain.emptyclassroom.repository;

import com.example.Ukiki.domain.emptyclassroom.entity.EmptyClassroom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmptyClassroomRepository extends JpaRepository<EmptyClassroom, Integer>, EmptyClassroomRepositoryCustom {
}
