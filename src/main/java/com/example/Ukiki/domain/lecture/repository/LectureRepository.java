package com.example.Ukiki.domain.lecture.repository;

import com.example.Ukiki.domain.lecture.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Integer>, LectureRepositoryCustom {
}
