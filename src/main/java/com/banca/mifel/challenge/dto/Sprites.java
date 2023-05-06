package com.banca.mifel.challenge.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.ToString;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@ToString
@Data
public class Sprites {

	private String backDefault;
	private String backShiny;
	private String frontDefault;
	private String frontShiny;
	private String backFemale;
	private String backShinyFemale;
	private String frontFemale;
	private String frontShinyFemale;

}
