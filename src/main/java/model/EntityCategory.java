package model;

import javax.persistence.*;

@Entity
@Table(name = "table_category")
public class EntityCategory {

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


}