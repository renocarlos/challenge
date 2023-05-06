package com.banca.mifel.challenge.controller;

import com.banca.mifel.challenge.dto.Pokemon;
import com.banca.mifel.challenge.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pokemon")
@RequiredArgsConstructor
public class PokemonController {
    @Autowired
    private final PokemonService pokemonService;

    @GetMapping("/{name}")
    public ResponseEntity<Pokemon> getPokemonByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(pokemonService.getPokemonByName(name), HttpStatus.OK);
    }
}
