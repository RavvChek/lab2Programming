package org.itmo.lab2.pokemon.move.specialMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(new Effect().chance(0.3).success()){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "парализует противника с вероятность в 30%";
    }
}
