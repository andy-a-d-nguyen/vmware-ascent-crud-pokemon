package com.galvanize.rubenandypokemon;

import java.util.ArrayList;

public class PokemonDataService {

    private ArrayList<PokemonData> pokemonArray = new ArrayList<>();
    
    public PokemonDataService() {}

    public ArrayList<PokemonData> getPokemonData() {
        return pokemonArray;
    }
    
    public PokemonData addPokemon(PokemonData pokemonData){
        pokemonArray.add(pokemonData);
        return pokemonData;
    }
    
//    public PokemonData updatePokemon(PokemonData pokemonData) {
//        return null;
//    }
}
