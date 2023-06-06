package dao;

import helper.DataBaseHelper;
import model.EntityCategory;
import model.EntityModel;

import java.util.List;

public class EntityModelDaoImpl implements EntityModelDao{

    public void save(EntityModel model) {
        DataBaseHelper.getInstance().save(model);
    }

    public void update(EntityModel model) {
        DataBaseHelper.getInstance().update(model);
    }

    public void delete(EntityModel model) {
        DataBaseHelper.getInstance().delete(model);
    }

    public List<EntityModel> getListModel(EntityCategory entityCategory) {
        return DataBaseHelper.getInstance().createQuery(String.format("FROM EntityModel WHERE id_category = '%s'", entityCategory.getId())).list();
    }

}
