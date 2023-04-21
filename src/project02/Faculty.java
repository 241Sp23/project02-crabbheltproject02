package project02;

//Faculty class that extends employee
public class Faculty extends Employee {
    private double annualSalary;
    private int weeksPerYear;
    private String department;
    
    //method to instantiate faculty object
    public Faculty(String name, int number, boolean working, double salary, int weeks, String dept){
    
        super(name, number, working);
        annualSalary = salary;
        weeksPerYear = weeks;
        department = dept;
        
    }
    
    //method to get pay of faculty member
    public double getPay(){
        return (annualSalary * 2)/weeksPerYear;
    }
    
    //toString method that returns String
    public String toString(){
        return super.toString() + " " + this.annualSalary + " " + this.weeksPerYear + " " + this.department;
    }
}
