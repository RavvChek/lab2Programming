package org.itmo.lab2.pokemon.pokemons;

import org.itmo.lab2.pokemon.move.physicalMove.Bite;
import org.itmo.lab2.pokemon.move.statusMove.Confide;
import org.itmo.lab2.pokemon.move.statusMove.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Patrat extends Pokemon {
    public Patrat(String name, int level){
        super(name, level);
        setStats(45, 55, 39, 35, 39, 42);
        setType(Type.NORMAL);
        setMove(new Bite(), new DoubleTeam(), new Confide());
    }
}
