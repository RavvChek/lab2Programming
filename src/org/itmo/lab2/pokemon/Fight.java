package org.itmo.lab2.pokemon;

import org.itmo.lab2.pokemon.pokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class  Fight {
    public static void main(String[] args) {
        Battle fight = new Battle();
        Mimikyu p1 = new Mimikyu("Scally Milano", 20);
        Patrat p2 = new Patrat("MORGENSHTERN", 20);
        Roselia p3 = new Roselia("Mayot", 20);
        Budew p4 = new Budew("OGBuda", 20);
        Watchog p5 = new Watchog("SodaLuv", 20);
        Roserade p6 = new Roserade("Bushido Zho", 20);
        fight.addAlly(p1);
        fight.addAlly(p2);
        fight.addAlly(p3);
        fight.addFoe(p4);
        fight.addFoe(p5);
        fight.addFoe(p6);
        fight.go();
    }
}