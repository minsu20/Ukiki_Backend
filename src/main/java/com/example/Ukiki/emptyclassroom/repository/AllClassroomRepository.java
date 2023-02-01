package com.example.Ukiki.emptyclassroom.repository;

import com.example.Ukiki.emptyclassroom.entity.AllClassroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllClassroomRepository extends JpaRepository<AllClassroom, Integer>, AllClassroomRepositoryCustom {
}
