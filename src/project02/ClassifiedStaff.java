package project02;

//ClassifiedStaff class that extends Employee
public class ClassifiedStaff extends Employee {
    private double weeklySalary;
    private String division;
    
    //method that instantiates ClassifiedStaff object
    public ClassifiedStaff(String name, int number, boolean working, double salary, String div){
        
        super(name, number, working);
        weeklySalary = salary;
        division = div;
        
    }
    
    //get method to get the pay
    public double getPay(){
        return weeklySalary * 2;
    }
    
    //method that returns String
    public String toString(){
        return super.toString() + " " + this.weeklySalary + " " + this.division;
    }
}
