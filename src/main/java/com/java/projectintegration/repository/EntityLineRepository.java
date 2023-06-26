package com.java.projectintegration.repository;

import com.java.projectintegration.model.EntityLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityLineRepository extends JpaRepository<EntityLine, Integer> {
}

