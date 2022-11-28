package org.itmo.lab2.pokemon.pokemons;

import org.itmo.lab2.pokemon.move.specialMove.EnergyBall;
import org.itmo.lab2.pokemon.move.specialMove.LeafStorm;
import org.itmo.lab2.pokemon.move.specialMove.MegaDrain;
import org.itmo.lab2.pokemon.move.statusMove.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Roselia {
    public Roserade(String name, int level){
        super(name, level);
        setStats(60, 70, 65, 125, 105, 90);
        setType(Type.GRASS, Type.POISON);
        setMove(new DoubleTeam(), new LeafStorm(), new MegaDrain(), new EnergyBall());
    }
}
