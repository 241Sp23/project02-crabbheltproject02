/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project2;

public abstract class Employee {
    
    String employeeName;
    int employeeId;
    boolean isWorking;
    
    public Employee(String name, int number, boolean employed){
        employeeName = name;
        employeeId = number;
        isWorking = employed;
    }
    
    public String getName(){
        return employeeName;
    }
    
    public void setName(String name){
        this.employeeName = name;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeId(int number){
        this.employeeId = number;
    }
    
    public boolean isWorking(){
        return isWorking;
    }
    
    public void setIsWorking(boolean employed){
        this.isWorking = employed;
    }
    
    public abstract double getPay();
    
    public String toString(){
        return this.getName() + " " + this.getEmployeeId() + " " + this.isWorking();
    }
    
    
      
}
