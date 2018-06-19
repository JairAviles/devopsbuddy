package com.devopsbuddy.backend.persistance.repositories;

import com.devopsbuddy.backend.persistance.domain.backend.Plan;
import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Integer> {
}
