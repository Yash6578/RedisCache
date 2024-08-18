package com.practice.rediscache.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.practice.rediscache.model.entity.PlanEntity;
import com.practice.rediscache.service.RedisService;
import lombok.AllArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
public class RedisServiceImpl implements RedisService {
    private final RedisTemplate redisTemplate;
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T get(String id, Class<T> entityClass) throws JsonProcessingException {
        Object obj = redisTemplate.opsForValue().get(id);
        if(obj != null) {
            return objectMapper.readValue(obj.toString(), entityClass);
        }
        return null;
    }


    @Override
    public void save(String id, Object obj, Long ttl) throws JsonProcessingException {
        redisTemplate.opsForValue().set(id, objectMapper.writeValueAsString(obj), ttl, TimeUnit.SECONDS);
    }
}
