package org.itmo.lab2.pokemon.pokemons;

import org.itmo.lab2.pokemon.move.specialMove.LeafStorm;
import org.itmo.lab2.pokemon.move.statusMove.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Budew {
    public Roselia(String name, int level){
        super(name, level);
        setStats(50, 60, 45, 100, 80, 65);
        setType(Type.GRASS, Type.POISON);
        setMove(new DoubleTeam(), new DoubleTeam(), new LeafStorm());
    }
}
