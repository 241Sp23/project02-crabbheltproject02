package project02;

public class StudentEmployee extends Employee {
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
    
     public double getPay(){
        return hoursWorked * payRate;
    }
    
    public String toString(){
        return super.toString() + " " + this.hoursWorked + " " + this.isWorkStudy + " " + this.payRate;
    }
}

