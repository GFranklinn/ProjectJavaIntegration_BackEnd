package model;

import javax.persistence.*;

@Entity
@Table(name = "table_category")
public class EntityCategory {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_line", columnDefinition = "int")
	private EntityLine entityLine;

	@Column(name = "name")
	private String name;

	public EntityCategory() {}

	public EntityCategory(EntityLine entityLine, Long id) {
		this.entityLine = entityLine;
		this.id = id;
	}

	public EntityLine getEntityLine(){
		return entityLine;
	}

	public void setEntityLine(EntityLine entityLine) {
		this.entityLine = entityLine;
	}

	@Override
	public String toString() {
		return name;
	}


}