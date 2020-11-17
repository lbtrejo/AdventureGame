package utils.creature;

import utils.classes.warrior;

import static utils.general.roll.*;

public class playerWarrior extends creature implements warrior {

    public playerWarrior(){};

    public playerWarrior(String name, int health, int strength, int intelligence){
        this.name = name;
        this.health = health;
        this.intelligence = intelligence;
        this.strength = strength;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setInt(int intelligence){
        this.intelligence = intelligence;
    }

    public void setStr(int strength){
        this.strength = strength;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getInt(){
        return this.intelligence;
    }

    public int getStr(){
        return this.strength;
    }

    @Override
    public int melee() {
        int strength = getStr();
        return strength * roll6();
    }

    @Override
    public int special() {
        return 0;
    }

    @Override
    public int shout() {
        return 0;
    }

    @Override
    public int attack() {
        return 0;
    }
}
