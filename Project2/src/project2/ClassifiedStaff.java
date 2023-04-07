/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

public class ClassifiedStaff extends Employee {
    
    private double weeklySalary;
    private String division;
    
    public ClassifiedStaff(String name, int number, boolean working, double salary, String div){
        
        super(name, number, working);
        weeklySalary = salary;
        division = div;
        
    }
    
    
    
}
