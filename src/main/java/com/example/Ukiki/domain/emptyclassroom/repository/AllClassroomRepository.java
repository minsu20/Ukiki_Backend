package com.example.Ukiki.domain.emptyclassroom.repository;

import com.example.Ukiki.domain.emptyclassroom.entity.AllClassroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllClassroomRepository extends JpaRepository<AllClassroom, Integer>, AllClassroomRepositoryCustom {
}
