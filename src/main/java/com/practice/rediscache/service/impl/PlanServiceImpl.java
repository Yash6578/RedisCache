package com.practice.rediscache.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.practice.rediscache.model.entity.PlanEntity;
import com.practice.rediscache.repo.PlanRepo;
import com.practice.rediscache.service.PlanService;
import com.practice.rediscache.service.RedisService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlanServiceImpl implements PlanService {
    private final PlanRepo planRepo;
    private final RedisService redisService;
    @Override
    public PlanEntity get(Long id) throws JsonProcessingException {
        PlanEntity plan = redisService.get(id.toString(), PlanEntity.class);
        if(null != plan) {
            return plan;
        } else {
            plan = planRepo.findById(id).orElse(null);
            redisService.save(id.toString(), plan, 300L);
        }

        return plan;
    }

    @Override
    public PlanEntity save(PlanEntity plan) {
        return planRepo.save(plan);
    }
}
