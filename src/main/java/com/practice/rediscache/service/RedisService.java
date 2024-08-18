package com.practice.rediscache.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisService {
    <T> T get(String id, Class<T> planEntityClass) throws JsonProcessingException;
    void save(String id, Object obj, Long ttl) throws JsonProcessingException;
}
