/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

/**
 *
 * @author s550248
 */
public class StudentEmployee extends Employee{
    
    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;
    
    public StudentEmployee(String name, int number, boolean working, int hours, boolean workStudy, 
    double rate){
        
        super(name, number, working);
        hoursWorked = hours;
        isWorkStudy = workStudy;
        payRate = rate;
    }
    
    
    
}
