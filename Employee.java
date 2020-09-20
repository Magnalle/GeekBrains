/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeginner_4;

/**
 *
 * @author Valentina
 */
public class Employee {
    
    private String FIO;
    private double salary;
    private int age;
    private int number;
    private static int lastNumber = 1;
    
    public Employee(String FIO, double salary, int age)
    {
        this.FIO = FIO;
        this.salary = salary;
        this.age = age;
        this.number = lastNumber++;
    }

    public String getFIO() {
        return FIO;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString()
    {
        return number + ". ФИО: " + FIO + ", " + age + " лет, ЗП: " + salary;
    }
    
}
