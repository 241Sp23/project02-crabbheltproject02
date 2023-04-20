package project02;

public class ClassifiedStaff extends Employee {
    private double weeklySalary;
    private String division;
    
    public ClassifiedStaff(String name, int number, boolean working, double salary, String div){
        
        super(name, number, working);
        weeklySalary = salary;
        division = div;
        
    }
    
    public double getPay(){
        return weeklySalary * 2;
    }
    
    public String toString(){
        return super.toString() + " " + this.weeklySalary + " " + this.division;
    }
}
