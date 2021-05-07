package com.galvanize.rubenandypokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonDataTest {
    @Test
    void getNameTest() {
        PokemonData pikachu = new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60);
        String actualName = pikachu.getName();
        assertEquals("Pikachu", actualName, "should return Pokemon name");
    }

    @Test
    void getIdTest() {
        PokemonData pikachu = new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60);
        int actualId = pikachu.getId();
        assertEquals(1, actualId, "should return Pokemon with Id of one");
    }

    @Test
    void getTypeTest() {
        PokemonData pikachu = new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60);
        String actualType = pikachu.getType();
        assertEquals("Electric", actualType, "should return Pokemon with Type of electric");
    }

    @Test
    void getStatusTest(){
        PokemonData pikachu = new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60);
        PokemonData.Status status = pikachu.getStatus();
        assertEquals(PokemonData.Status.FAINTED, status.valueOf("FAINTED"), "should return Pokemon with Status of fainted");
    }

    @Test
    void getHPTest(){
        PokemonData pikachu = new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60);
        int actualHP = pikachu.getHp();
        assertEquals(100, actualHP, "should return Pokemon HP");
    }

    @Test
    void getLvlTest(){
        PokemonData pikachu = new PokemonData("Pikachu", 1, "Electric", PokemonData.Status.FAINTED, 100, 60);
        int actualLvl = pikachu.getLvl();
        assertEquals(60, actualLvl, "should return Pokemon HP");
    }

}
