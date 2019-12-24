package com.repository;

import com.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Activity, Long> {
}
