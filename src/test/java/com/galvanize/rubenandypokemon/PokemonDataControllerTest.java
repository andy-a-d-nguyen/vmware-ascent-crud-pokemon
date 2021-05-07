package com.galvanize.rubenandypokemon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType;


@WebMvcTest(PokemonDataController.class)
public class PokemonDataControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PokemonDataService pokemonDataService;

    ArrayList<PokemonData> pokemons;

    @BeforeEach
    void setUp() {
        pokemons = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pokemons.add(new PokemonData("Pikachu", i, "Electric", PokemonData.Status.FAINTED, 100, 60));
        }
    }

    @Test
    void getPokemonTest() throws Exception {
        when(pokemonDataService.getPokemonData()).thenReturn(pokemons);

        mockMvc.perform(MockMvcRequestBuilders.get("/pokemon"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$", hasSize(5)));
    }

    @Test
    void addPokemonTest() throws Exception {
        when(pokemonDataService.addPokemon(any(PokemonData.class))).thenReturn(new PokemonData("Pikachu", 3, "Electric", PokemonData.Status.FAINTED, 100, 60));

                mockMvc.perform(post("/pokemon")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content("{\"name\":\"Pikachu\",\"id\":4,\"type\":\"Electric\",\"status\":\"FAINTED\",\"hp\":100,\"lvl\":60}"))
                        .andExpect(status().isOk())
                        .andExpect(jsonPath("name").value("Pikachu"));
    }

//    @Test
//    void updatePokemonTest() throws Exception {
//        when(pokemonDataService.updatePokemon(any(PokemonData.class))).thenReturn(new PokemonData("Pikachu", 3, "Electric", PokemonData.Status.HEALTHY, 100,60));
//
//        mockMvc.perform(put("/pokemon/{id}")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content("{\"name\":\"Pikachu\",\"id\":4,\"type\":\"Electric\",\"status\":\"HEALTHY\",\"hp\":100,\"lvl\":60}"))
//                .andExpect(status().isOk());
//    }
}
