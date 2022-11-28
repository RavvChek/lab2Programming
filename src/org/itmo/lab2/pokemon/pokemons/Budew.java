package org.itmo.lab2.pokemon.pokemons;

import org.itmo.lab2.pokemon.move.specialMove.MegaDrain;
import org.itmo.lab2.pokemon.move.statusMove.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level){
        super(name, level);
        setStats(40, 30, 35, 50, 70, 55);
        setType(Type.GRASS, Type.POISON);
        setMove(new DoubleTeam(), new MegaDrain());
    }
}
