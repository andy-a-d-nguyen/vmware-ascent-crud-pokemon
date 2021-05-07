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

//    @PutMapping("/pokemon/{id}")
//    public PokemonData updatePokemon(@PathVariable(value = "id") Long id, @RequestBody PokemonData pokemon){
//        return null;
//    }

//    public ResponseEntity<User> updateUser(
//            @PathVariable(value = "id") Long userId,
//            @Valid @RequestBody User userDetails)
//            throws ResourceNotFoundException {
//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found on :: "+ userId));
//
//        user.setEmailId(userDetails.getEmailId());
//        user.setLastName(userDetails.getLastName());
//        user.setFirstName(userDetails.getFirstName());
//        user.setUpdatedAt(new Date());
//        final User updatedUser = userRepository.save(user);
//        return ResponseEntity.ok(updatedUser);
//    }
}
