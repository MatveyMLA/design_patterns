package proxy.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Item")
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String description;

	public Item(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Item() {}
	
	
	
	
	
}
