package dao;

import model.EntityLine;
import java.util.List;

public interface EntityLineDao {
    void save(EntityLine line);
    void update(EntityLine line);
    void delete(EntityLine line);
    List<EntityLine> getListLine();
}
