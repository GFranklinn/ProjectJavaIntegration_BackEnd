package com.java.projectintegration.repository;

import com.java.projectintegration.model.EntityCategory;
import com.java.projectintegration.model.EntityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityModelRepository extends JpaRepository<EntityModel, Integer> {
    List<EntityModel> findModelByEntityCategory(EntityCategory id_category);
}
