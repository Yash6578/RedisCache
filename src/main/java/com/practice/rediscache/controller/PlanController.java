package com.practice.rediscache.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.practice.rediscache.model.entity.PlanEntity;
import com.practice.rediscache.service.PlanService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PlanController {

    private final PlanService planService;

    @PostMapping("/plan")
    public ResponseEntity<PlanEntity> save(@RequestBody PlanEntity plan) throws JsonProcessingException {
        return ResponseEntity.ok(planService.save(plan));
    }


    @GetMapping("/plan/{id}")
    public ResponseEntity<PlanEntity> getById(@PathVariable Long id) throws JsonProcessingException {
        return ResponseEntity.ok(planService.get(id));
    }
}
