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
public abstract class Animal {
    protected abstract double getRunDistance();
    protected abstract double getSwimDistance();
    protected abstract double getJumpDistance();
    protected abstract String getAnimalCalling();
    protected void swim(double distance){
        if(distance < getSwimDistance())
            System.out.println(getAnimalCalling() + " проплыл " + distance + "!");
        else
            System.out.println(getAnimalCalling() + " не смог проплыть " + distance + "!");
    }
    
    protected void run(double distance){
        if(distance < getRunDistance())
            System.out.println(getAnimalCalling() + " пробежал " + distance + "!");
        else
            System.out.println(getAnimalCalling() + " не смог побежать " + distance + "!");
    }
    
    protected void jump(double distance){
        if(distance < getJumpDistance())
            System.out.println(getAnimalCalling() + " перепрыгнул " + distance + "!");
        else
            System.out.println(getAnimalCalling() + " не смог перепрыгнуть " + distance + "!");
    }
    
}
