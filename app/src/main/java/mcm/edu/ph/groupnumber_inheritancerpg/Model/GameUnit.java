package mcm.edu.ph.groupnumber_inheritancerpg.Model;


import java.util.Random;

public class GameUnit {


    //Global Variables - variables that are defined within the class
    private double healthPoint;
    private double manaPoint;
    private String unitName;
    private double armorPoint;
    private double unitTitle;
    private int atkMin; //global variable
    private int atkMax;
    private int level;


    //this keyword refers to the global variable of the same name


    int baseDamage(int atkMin, int atkMax){
        Random randomizer = new Random();
        return (randomizer.nextInt(atkMax - atkMin) +atkMin);
    }

    int baseDamage(){
        return 0;

    }
    //GETTERS - allows information viewing on a value inside the class
    public double getHealthPoint(){return healthPoint; }
    public double getManaPoint() {
        return manaPoint;
    }
    public String getUnitName() {return unitName; }
    public double getArmorPoint() { return armorPoint; }
    public double getUnitTitle() { return unitTitle; }
    public int getAtkMin() { return atkMin; }
    public int getAtkMax() { return atkMax; }
    public int getLevel() { return level; }

    //SETTERS - allows information editing on a value inside the class
    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setManaPoint(double manaPoint) {
        this.manaPoint = manaPoint;
    }
    public void setUnitName(String unitName) { this.unitName = unitName; }
    public void setArmorPoint(double armorPoint) { this.armorPoint = armorPoint; }
    public void setAtkMin(int atkMin) { this.atkMin = atkMin; }
    public void setAtkMax(int atkMax) { this.atkMax = atkMax; }
    public void setLevel(int level) { this.level = level; }

    //CONSTRUCTORS - methods that are named after the class themselves
    public GameUnit(/*parameter*/){} //default constructor - has no parameters
    public GameUnit(double healthPoint, double manaPoint){
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
    }

}
