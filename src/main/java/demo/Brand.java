package demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Brand {

	@Id
	@GeneratedValue
	public Long id;

	@Column(nullable = false)
	@Size(min = 2, max = 30)
	private String name;

	public Brand(){

	}

	public Brand(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

