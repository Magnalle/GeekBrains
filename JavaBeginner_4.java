/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabeginner_4;

import java.util.Arrays;

/**
 *
 * @author Valentina
 */
public class JavaBeginner_4 {

    /**
     * @param args the command line arguments
     */
    public static void raiseSalary(Employee[] employees, double raise)
    {
        for(int i = 0; i < employees.length; i++)
            if(employees[i].getAge() > 45)
                employees[i].setSalary(employees[i].getSalary() + raise);
    }
    
    public static void dispayAverageValues(Employee[] employees)
    {
        int ages = 0;
        double salaries = 0;
        for(int i = 0; i < employees.length; i++)
        {
            ages += employees[i].getAge();
            salaries += employees[i].getSalary();
        }
        System.out.println("Средний возраст:" + ((double)ages / employees.length)+ ", средняя зарплата: " + (salaries / employees.length));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] employees = {
            new Employee("Сотрудник 1", 1000, 20),
            new Employee("Сотрудник 2", 2000, 25),
            new Employee("Сотрудник 3", 3000, 30),
            new Employee("Сотрудник 4", 2500, 30),
            new Employee("Сотрудник 5", 5000, 47)};
        System.out.println("Сотрудник: " + employees[0].getFIO() + ", возраст: " + employees[0].getAge());
        
        raiseSalary(employees, 5000);
        
        System.out.println(Arrays.toString(employees)); // все сотрудники после увеличения для проверки
        
        for(int i = 0; i < employees.length; i++)
            if(employees[i].getAge() > 40)
                System.out.println(employees[i].toString());
        
        dispayAverageValues(employees);
    }
    
}
