package com.school.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entities.School;

public interface SchoolRepository extends JpaRepository<School,Long> {
}
