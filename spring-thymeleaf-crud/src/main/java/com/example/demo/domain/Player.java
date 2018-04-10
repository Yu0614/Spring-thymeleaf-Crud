package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	// id
	private Long id;

	// name
	@NotEmpty @Size(max=30)
	private String name;

	// age
	@NotNull @Min(value=0) @Max(value= 150)
	private Integer age;

	// team
	private String team;

	// position
	private String position;


	// setter&getter : Start here

	/****************
	 *
	 *  setter&Getter of id
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	/****************
	 *
	 *  setter&Getter of name
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/****************
	 *
	 *  setter&Getter of team
	 */
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;

	}

	/****************
	 *
	 *  setter&Getter of position
	 */
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	/****************
	 *
	 *  setter&Getter of position
	 */
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	// setter&getter : End here

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name +
				", age=" + age + ", team="+ team +
				 ", position=" + position + " ]";
	}


}
