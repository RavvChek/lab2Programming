package org.itmo.lab2.pokemon.pokemons;

import org.itmo.lab2.pokemon.move.physicalMove.PoisonJab;
import org.itmo.lab2.pokemon.move.physicalMove.Spark;
import org.itmo.lab2.pokemon.move.specialMove.ChargeBeam;
import org.itmo.lab2.pokemon.move.specialMove.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mimikyu extends Pokemon {
    public Mimikyu(String name, int level){
        super(name, level);
        setStats(55, 90, 80, 50, 105, 96);
        setType(Type.GHOST, Type.FAIRY);
        setMove(new PoisonJab(), new Thunder(), new ChargeBeam(), new Spark());
    }
}
