package org.itmo.lab2.pokemon.move.specialMove;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (new Effect().chance(0.1).success()){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "понижает спеуиальную защиту соперника с вероятностью в 10%";
    }
}
