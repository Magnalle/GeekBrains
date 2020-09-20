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
public class Dog extends Animal{

    static private double runDistance = 500; // чтобы сделать индивидуальную максимальную дистанцию для каждого животного достаточно сделать переменную не статической и инициализировать ее
    static private double swimDistance = 10;
    static private double jumpDistance = 0.5;
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
        return "Пёсик";
    }
    
   
}
