package com.galvanize.rubenandypokemon;

public class PokemonData {

    private String name;
    private int id;
    private String type;
    private Status status;
    private int hp;
    private int lvl;

    public enum Status {
        FAINTED("fainted"),
        HEALTHY("healthy");

        public final String status;

        private Status(String status) {
            this.status = status;
        }
        @Override
        public String toString() {
            return this.status;
        }
    }

    public PokemonData(String name, int id, String type, Status status, int hp, int lvl) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.status = status;
        this.hp = hp;
        this.lvl = lvl;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return type;
    }

    public Status getStatus() {
        return this.status;
    }
    
    public int getHp() {
        return hp;
    }
    
    public int getLvl() {
        return lvl;
    }
}
