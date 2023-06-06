    package model;

    import javax.persistence.*;
    import java.util.List;

    import dao.EntityLineDaoImpl;
    import helper.DataBaseHelper;

    @Entity
    @Table(name = "table_line")
    public class EntityLine implements EntityInterface{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;

        public EntityLine(){}
        public EntityLine(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return name;
        }

        public void save(){
            EntityLineDaoImpl lineDao = new EntityLineDaoImpl();
            lineDao.save(this);
        }

        public void update(){
            EntityLineDaoImpl lineDao = new EntityLineDaoImpl();
            lineDao.update(this);
        }

        public void delete(){
            EntityLineDaoImpl lineDao = new EntityLineDaoImpl();
            lineDao.delete(this);
        }

    }
