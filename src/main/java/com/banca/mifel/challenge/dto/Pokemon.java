package com.banca.mifel.challenge.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.ToString;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@ToString
public class Pokemon {

	private List<Abilities> abilities;
	private int baseExperience;
	private List<NamedApiResource> forms;
	private List<GameIndices> gameIndices;
	private int height;
	private List<HeldItems> heldItems;
	private int id;
	private Boolean isDefault;
	private String locationAreaEncounters;
	private List<Moves> moves;
	private String name;
	private int order;
	private NamedApiResource species;
	private Sprites sprites;
	private int weight;

}
