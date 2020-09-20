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
public class JavaBeginner_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.run(300);
        cat.run(150);
        cat.swim(1);
        cat.jump(1);
        cat.jump(3);
        
        dog.run(300);
        dog.run(600);
        dog.swim(1);
        dog.swim(11);
        dog.jump(0.1);
        dog.jump(1);
    }
    
}
