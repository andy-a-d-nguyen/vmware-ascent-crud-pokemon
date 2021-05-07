package com.galvanize.rubenandypokemon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class PokemonDataServiceTest {

    PokemonDataService pokemonDataService;

    ArrayList<PokemonData> pokemons;

    @BeforeEach
    void setUp() {
        pokemonDataService = new PokemonDataService();
        pokemons = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pokemons.add(pokemonDataService.addPokemon(new PokemonData("Pikachu", i, "Electric", PokemonData.Status.FAINTED, 100, 60)));
        }
    }

    @Test
    void addPokemonData() {
        pokemonDataService.addPokemon(new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60));
        assertEquals(6, pokemonDataService.getPokemonData().size());
    }

    @Test
    void getPokemonData(){
        assertEquals(5, pokemonDataService.getPokemonData().size());
    }

}
