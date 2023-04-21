package project02;

//create StudentEmployee class that extends Employee
public class StudentEmployee extends Employee {
    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;
    
    //method to instantiate StudentEmployee method
    public StudentEmployee(String name, int number, boolean working, int hours, boolean workStudy, 
    double rate){
        
        super(name, number, working);
        hoursWorked = hours;
        isWorkStudy = workStudy;
        payRate = rate;
    }
    
    //get method
     public double getPay(){
        return hoursWorked * payRate;
    }
    
     //toString method
    public String toString(){
        return super.toString() + String.format("%" + 10 + "s", " " + this.hoursWorked + " " + this.isWorkStudy + " " + this.payRate);
    }
}

