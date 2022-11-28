package org.itmo.lab2.pokemon.move.physicalMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spark extends PhysicalMove {
    public Spark(){
        super(Type.ELECTRIC, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(new Effect().chance(0.3).success()){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "атакует противника с вероятностью 30% парализовать его";
    }

}
