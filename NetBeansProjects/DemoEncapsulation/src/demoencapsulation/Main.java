/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoencapsulation;

import content.Employee;
import content.Worker;

/**
 *
 * @author divya
 */
public class Main {

    public static void main(String[] args) {
        Worker one = new Worker();
        System.out.println("Worker name is : "+one.getName());
        one.setName("Dani");
        System.out.println(one.getName());
        
        Employee e1 = new Employee();
        System.out.println("Employee pay is $"+e1.getPay()+" for "+e1.getHours()+" hours.");
        
        Employee four = new Employee();
        four.setHours(30);
        four.setRate(12);
        System.out.println(four.getPay());
       
    }

}
