package com.banca.mifel.challenge.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.ToString;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@ToString
@Data
public class GameIndices {

	private int gameIndex;
	private NamedApiResource version;

}
