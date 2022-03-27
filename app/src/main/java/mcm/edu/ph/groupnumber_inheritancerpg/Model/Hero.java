package mcm.edu.ph.groupnumber_inheritancerpg.Model;

import java.util.Random;

public class Hero extends GameUnit{

    double expPoint;
    int strength;
    int agility;
    int intelligence;
    int constitution;
    int luck;
    int goldValue;

    //borrowed variables
    String unitName;
    double healthPoint;
    double manaPoint;
    int atkMax;
    int atkMin;


    public Hero(){} //default constructor

    public Hero(String unitName, int lvl, double hp, double mp, int str, int agi, int intell, int consti, int luck){
        super.setUnitName(unitName);
        super.setLevel(lvl);
        super.setHealthPoint(hp);
        super.setManaPoint(mp);
        strength = str;
        agility = agi;
        intelligence = intell;
        constitution = consti;
        this.luck = luck;
    }



    public Hero(String unitName, double healthPoint, double manaPoint){

        super.setUnitName(unitName);
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);

    }
    public void setHealthPoint(int constitution){

    }
    @Override
    public double getHealthPoint() {
        this.healthPoint = super.getHealthPoint(); // from SUPER to GLOBAL
        this.healthPoint += (constitution * 20); //for every point of constitution, it adds 20 health points to the base health point amount
        return (this.healthPoint);
    }
    @Override
    public double getManaPoint() {
        this.manaPoint = super.getManaPoint(); // from SUPER to GLOBAL
        this.manaPoint += (intelligence * 12); //for every point of intelligence, it adds 12 mana points to the base mana point amount
        return (this.manaPoint);
    }
    @Override
    public int getAtkMax() {
        this.atkMax = super.getAtkMax();
        this.atkMax += (strength * 2);
        return this.atkMax;
    }
    @Override
    public int getAtkMin() {
        this.atkMin = super.getAtkMin();
        this.atkMin += (agility * 2);
        return this.atkMax;
    }
    @Override
    int baseDamage(int atkMin, int atkMax){
        Random randomizer = new Random();
        return (randomizer.nextInt(this.atkMax - this.atkMin) +this.atkMin);
    }













//getters
    public double getExpPoint() { return expPoint; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }
    public int getIntelligence() { return intelligence; }
    public int getConstitution() { return constitution; }
    public int getLuck() { return luck; }
    public int getGoldValue() { return goldValue; }
//setters
    public void setExpPoint(double expPoint) { this.expPoint = expPoint; }
    public void setStrength(int strength) { this.strength = strength;    }
    public void setAgility(int agility) { this.agility = agility; }
    public void setIntelligence(int intelligence) { this.intelligence = intelligence; }
    public void setConstitution(int constitution) { this.constitution = constitution; }
    public void setLuck(int luck) { this.luck = luck; }
    public void setGoldValue(int goldValue) { this.goldValue = goldValue; }
}
