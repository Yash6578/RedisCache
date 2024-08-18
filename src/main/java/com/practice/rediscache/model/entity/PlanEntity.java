package com.practice.rediscache.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionIdJdbcTypeCode;

@Data
@Entity
@Table(name = "plan")
@AllArgsConstructor
@NoArgsConstructor
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    Double price;
}
