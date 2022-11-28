package org.itmo.lab2.pokemon.move.specialMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class MegaDrain extends SpecialMove {
    public MegaDrain(){
        super(Type.GRASS, 40, 100);
    }
    double hpRecover;
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        this.hpRecover = damage / 2;
        super.applyOppDamage(p, damage);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, (int) Math.round(-this.hpRecover));
    }
    @Override
    protected String describe(){
        return "вытягивает половину нанесённого урона для лечения";
    }
}
