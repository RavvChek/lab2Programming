package org.itmo.lab2.pokemon.move.specialMove;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.ELECTRIC, 50, 90);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.7);
        if(e.success()){
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }
    @Override
    protected String describe(){
        return "увеличивает специальную атаку пользователя на 1 степень с вероятностью в 70%";
    }
}
