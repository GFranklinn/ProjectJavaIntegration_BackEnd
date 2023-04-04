package model;

import javax.persistence.*;

@Entity
@Table(name = "table_model")
public class EntityModel {

	@Id
	@Column(name = "id", columnDefinition = "int")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_category", columnDefinition = "int")
	private EntityCategory entityCategory;

	@Column(name = "name")
	private String name;

	public EntityModel(){}

	EntityModel(EntityCategory entityCategory, Long id) {
		this.entityCategory = entityCategory;
		this.id = id;
	}

	public EntityCategory getEntityCategory() {
		return entityCategory;
	}

	public void setEntityCategory(EntityCategory entityCategory) {
		this.entityCategory = entityCategory;
	}

	@Override
	public String toString() {
		return name;
	}
}