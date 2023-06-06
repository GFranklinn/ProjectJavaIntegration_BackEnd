package dao;

import helper.DataBaseHelper;
import model.EntityLine;

import java.util.List;

public class EntityLineDaoImpl implements EntityLineDao{

    public void save (EntityLine line) {
        DataBaseHelper.getInstance().save(line);
    }

    public void update(EntityLine line) {
        DataBaseHelper.getInstance().update(line);
    }

    public void delete(EntityLine line){
        DataBaseHelper.getInstance().delete(line);
    }

    public List<EntityLine> getListLine() {
        return DataBaseHelper.getInstance().createQuery("FROM EntityLine ", EntityLine.class).list();
    }
}

