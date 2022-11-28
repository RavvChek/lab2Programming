package org.itmo.lab2.pokemon.move.specialMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class LeafStorm extends SpecialMove {
    public LeafStorm(){
    super(Type.GRASS, 130, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        if(Math.random() < 0.9){
            p.setMod(Stat.SPECIAL_ATTACK, -2);
        }
    }
    @Override
    protected String describe(){
        return "понижает свою специальную атаку на две ступени после нанесения урона";
    }
}
