package com.practice.rediscache.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.practice.rediscache.model.entity.PlanEntity;

public interface PlanService {
    PlanEntity get(Long id) throws JsonProcessingException;
    PlanEntity save(PlanEntity plan) throws JsonProcessingException;
}
