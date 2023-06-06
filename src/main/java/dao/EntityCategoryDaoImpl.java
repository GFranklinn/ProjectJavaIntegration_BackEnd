package dao;

import helper.DataBaseHelper;
import model.EntityCategory;
import model.EntityLine;

import java.util.List;

public class EntityCategoryDaoImpl implements EntityCategoryDao{

    public void save(EntityCategory category) {
        DataBaseHelper.getInstance().save(category);
    }

    public void update(EntityCategory category) {
        DataBaseHelper.getInstance().update(category);
    }

    public void delete(EntityCategory category) {
        DataBaseHelper.getInstance().delete(category);
    }

    public List<EntityCategory> getListCategory(EntityLine cbbLineSelected) {
        return DataBaseHelper.getInstance().createQuery(String.format("FROM EntityCategory WHERE id_line = '%s '", cbbLineSelected.getId())).list();
    }

}
