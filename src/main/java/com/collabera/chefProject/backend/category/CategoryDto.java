package com.collabera.chefProject.backend.category;

import com.collabera.chefProject.backend.chef.Chef;
import com.collabera.chefProject.backend.chef.ChefDto;

public class CategoryDto {
	private long id;
	private String name;	
	
	public CategoryDto() {}


	public CategoryDto(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
