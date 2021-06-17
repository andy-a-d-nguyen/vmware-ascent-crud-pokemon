package com.galvanize.rubenandypokemon;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/pokemon")
public class PokemonDataController {

    PokemonDataService pokemonDataService;

    public PokemonDataController(PokemonDataService pokemonDataService) {
        this.pokemonDataService = pokemonDataService;
    }

    @GetMapping
    public ArrayList<PokemonData> getPokemon(){
        return pokemonDataService.getPokemonData();
    }

    @PostMapping
    public PokemonData addPokemon(@RequestBody PokemonData pokemon) {
        return pokemonDataService.addPokemon(pokemon);
    }
}
