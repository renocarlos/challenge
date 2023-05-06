package com.banca.mifel.challenge.dto;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.ToString;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@ToString
@Data
public class HeldItems {

	private NamedApiResource item;
	private List<VersionDetails> versionDetails;

}
