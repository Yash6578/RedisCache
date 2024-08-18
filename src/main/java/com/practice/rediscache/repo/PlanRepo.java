package com.practice.rediscache.repo;

import com.practice.rediscache.model.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepo extends JpaRepository<PlanEntity, Long> {

}
