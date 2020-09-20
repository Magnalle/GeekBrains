/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeginner_5;

/**
 *
 * @author Valentina
 */
public class Cat extends Animal{
    
    static private double runDistance = 200;
    static private double swimDistance = 0;
    static private double jumpDistance = 2;
    @Override
    protected double getRunDistance() {
        return runDistance;
    }

    @Override
    protected double getSwimDistance() {
        return swimDistance;
    }

    @Override
    protected double getJumpDistance() {
        return jumpDistance;
    }

    @Override
    protected String getAnimalCalling() {
        return "Котик";
    }
    
    
}
