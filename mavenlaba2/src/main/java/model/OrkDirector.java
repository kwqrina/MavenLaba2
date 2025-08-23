/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.builderFactories.OrkBuilderFactory;
import model.gearFactories.OrkGearFactory;

import static model.OrkType.*;


/**
 *
 * @author ekate
 */
public class OrkDirector {
    private final OrkBuilderFactory builderFactory;
    private final OrkGearFactory gearFactory;

    public OrkDirector(OrkBuilderFactory builderFactory, OrkGearFactory gearFactory) {
        this.builderFactory = builderFactory;
        this.gearFactory = gearFactory;
    }

    public Ork createBasicOrk() {
        return builderFactory.createOrkBuilder()
                .type(BASIC)
                .build();
    }

    public Ork createLeaderOrk() {
        return builderFactory.createOrkBuilder()
                .type(COMMANDER)
                .banner(gearFactory.createBanner() + " и Горн")
                .build();
    }

    public Ork createScoutOrk() {
        return builderFactory.createOrkBuilder()
                .type(SCOUT)
                .weapon("Лук")
                .build();
    }
    
}
