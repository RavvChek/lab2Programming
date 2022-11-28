package org.itmo.lab2.pokemon.move.physicalMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {
    public PoisonJab(){
        super(Type.POISON, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
            if(new Effect().chance(0.5).success()){
                Effect.poison(p);
            }
    }
    @Override
    protected String describe(){
        return "с вероятностью в 50% отравляет соперника";
    }
}
