package dao;

import model.EntityCategory;
import model.EntityModel;

import java.util.List;

public interface EntityModelDao {
    void save (EntityModel model);
    void update(EntityModel model);
    void delete(EntityModel model);
    List<EntityModel> getListModel(EntityCategory entityCategory);
}
