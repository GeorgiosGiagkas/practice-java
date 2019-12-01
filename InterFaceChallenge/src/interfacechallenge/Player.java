/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacechallenge;

import java.util.ArrayList;

/**
 *
 * @author giagkas
 */
public class Player implements ISavable{
    private String name;
    private int health;
    private int attackPoints;
    private int defencePoints;
    private String weapon;

    public Player(String name, int health, int attackPoints, int defencePoints, String weapon) {
        this.name = name;
        this.health = health;
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", health=" + health + ", attackPoints=" + attackPoints + ", defencePoints=" + defencePoints + ", weapon=" + weapon + '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add(0,this.name);
        myArrayList.add(1,String.valueOf(this.health));
        myArrayList.add(2,String.valueOf(this.attackPoints));
        myArrayList.add(3,String.valueOf(this.defencePoints));
        myArrayList.add(4,this.weapon);
        return myArrayList;
    }

    @Override
    public void read(ArrayList<String> savedValues) {
        if((!savedValues.isEmpty()) && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.health= Integer.parseInt(savedValues.get(1));
            this.attackPoints= Integer.parseInt(savedValues.get(2));
            this.defencePoints=Integer.parseInt(savedValues.get(3));
            this.weapon= savedValues.get(4);
        }
    }
    
    
}
