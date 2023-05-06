package com.banca.mifel.challenge.service.impl;

import com.banca.mifel.challenge.exceptions.PokemonNotFoundException;
import com.banca.mifel.challenge.dto.Pokemon;
import com.banca.mifel.challenge.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    private final RestTemplate restTemplate;
    @Value("${pokemon.service.url}")
    private String basePath;

    @Override
    public Pokemon getPokemonByName(String name) {
        try {
            return restTemplate.getForObject(basePath + "/" + name, Pokemon.class);
        } catch (Exception e) {
            throw new PokemonNotFoundException(name);
        }
    }
}
