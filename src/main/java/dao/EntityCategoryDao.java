package dao;

import model.EntityCategory;
import model.EntityLine;

import java.util.List;

public interface EntityCategoryDao {
    void save (EntityCategory entityCategory);
    void update(EntityCategory entityCategory);
    void delete(EntityCategory entityCategory);

    List<EntityCategory> getListCategory(EntityLine cbbLineSelected);
}
