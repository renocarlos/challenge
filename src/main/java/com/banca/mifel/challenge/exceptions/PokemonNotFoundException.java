package com.banca.mifel.challenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PokemonNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PokemonNotFoundException(String name) {
        super("Pokemon: " + name + " not found");
    }

}
