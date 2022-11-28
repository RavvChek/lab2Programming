package org.itmo.lab2.pokemon.pokemons;

import org.itmo.lab2.pokemon.move.physicalMove.Bite;
import org.itmo.lab2.pokemon.move.specialMove.Thunder;
import org.itmo.lab2.pokemon.move.statusMove.Confide;
import org.itmo.lab2.pokemon.move.statusMove.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Watchog extends Pokemon {
    public Watchog(String name, int level){
        super(name, level);
        setStats(60, 85, 69, 60, 69, 77);
        setType(Type.NORMAL);
        setMove(new DoubleTeam(), new Thunder(), new Confide(), new Bite());
    }
}
