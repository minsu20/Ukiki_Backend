package com.example.Ukiki.emptyclassroom.repository;

import com.example.Ukiki.emptyclassroom.entity.EmptyClassroom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmptyClassroomRepository extends JpaRepository<EmptyClassroom, Integer>, EmptyClassroomRepositoryCustom {
}
