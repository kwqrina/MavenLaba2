/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ekate
 */
public class Ork {
    private final String name;
    private final String weapon;
    private final String armor;
    private final String banner;
    private final int strength;
    private final int agility;
    private final int intelligence;
    private final int health;
    private final Tribe tribe;
    private final OrkType type;

    public Ork(String name, String weapon, String armor, String banner, 
              int strength, int agility, int intelligence, int health,
              Tribe tribe, OrkType type) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.banner = banner;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
        this.tribe = tribe;
        this.type = type;
    }

    public String getName() { return name; }
    public String getWeapon() { return weapon; }
    public String getArmor() { return armor; }
    public String getBanner() { return banner; }
    public int getStrength() { return strength; }
    public int getAgility() { return agility; }
    public int getIntelligence() { return intelligence; }
    public int getHealth() { return health; }
    public Tribe getTribe() { return tribe; }
    public OrkType getType() { return type; }
    
}
