package model;

import dao.EntityCategoryDaoImpl;

import javax.persistence.*;

@Entity
@Table(name = "table_category")
public class EntityCategory implements EntityInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "id_line", columnDefinition = "int")
	private EntityLine id_line;

	public EntityCategory(){}

	public EntityCategory(EntityLine id_line, int id, String name) {
		this.id_line = id_line;
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

	public void save() {
		EntityCategoryDaoImpl categoryDao = new EntityCategoryDaoImpl();
		categoryDao.save(this);
	}

	public void update() {
		EntityCategoryDaoImpl categoryDao = new EntityCategoryDaoImpl();
		categoryDao.update(this);
	}

	public void delete() {
		EntityCategoryDaoImpl categoryDao = new EntityCategoryDaoImpl();
		categoryDao.delete(this);
	}
}