    package com.java.projectintegration.repository;

    import com.java.projectintegration.model.EntityCategory;
    import com.java.projectintegration.model.EntityLine;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import java.util.List;

    @Repository
    public interface EntityCategoryRepository extends JpaRepository<EntityCategory, Integer> {
        List<EntityCategory> findCategoryByEntityLine(EntityLine id_line);
    }