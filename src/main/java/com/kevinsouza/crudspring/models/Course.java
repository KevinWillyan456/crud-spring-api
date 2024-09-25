package com.kevinsouza.crudspring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = Course.TABLE_NAME)
public class Course {
	public static final String TABLE_NAME = "course";

	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("_id")
	private Long id;

	@Column(name = "name", length = 200, nullable = false)
	private String name;

	@Column(name = "category", length = 10, nullable = false)
	private String category;
}
