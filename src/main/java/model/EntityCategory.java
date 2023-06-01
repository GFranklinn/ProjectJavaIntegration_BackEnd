package model;

import util.HibernateUtilFactory;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "table_category")
public class EntityCategory implements EntityInterface{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "id_line", columnDefinition = "int")
	private EntityLine id_line;

	public EntityCategory() {}

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

	public static List<EntityCategory> getListCategory(EntityLine cbbLineSelected) {
		List<EntityCategory> listCategory = HibernateUtilFactory.getInstance().createQuery(String.format("FROM EntityCategory WHERE id_line = '%s'", cbbLineSelected.getId())).list();
		return listCategory;
	}
}