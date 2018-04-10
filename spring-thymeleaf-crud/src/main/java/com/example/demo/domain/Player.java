package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String team;
	private String position;
	private Integer age;


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
	public void setId(String team) {
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
		return "Player [id=" + id + ", name=" + name + ", age=" + age +
				", team=" + team + ", position=" + position + " ]";
	}


}
