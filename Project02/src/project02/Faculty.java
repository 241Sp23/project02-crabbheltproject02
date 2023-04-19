package project02;

public class Faculty extends Employee {
    private double annualSalary;
    private int weeksPerYear;
    private String department;
    
    public Faculty(String name, int number, boolean working, double salary, int weeks, String dept){
    
        super(name, number, working);
        annualSalary = salary;
        weeksPerYear = weeks;
        department = dept;
        
    }
    
    public double getPay(){
        return (annualSalary * 2)/weeksPerYear;
    }
    
    public String toString(){
        return super.toString() + " " + this.annualSalary + " " + this.weeksPerYear + " " + this.department;
    }
}
