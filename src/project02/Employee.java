package project02;

//abstract Employee class
public abstract class Employee {
    private String employeeName;
    private int employeeId;
    private boolean isWorking;
    
    //method to show what Employee must have
    public Employee(String name, int number, boolean employed){
        employeeName = name;
        employeeId = number;
        isWorking = employed;
    }
    
    //get method
    public String getName(){
        return employeeName;
    }
    
    //set method
    public void setName(String name){
        this.employeeName = name;
    }
    
    //get method
    public int getEmployeeId(){
        return employeeId;
    }
    
    //set method
    public void setEmployeeId(int number){
        this.employeeId = number;
    }
    
    //method that returns boolean to see if Employee is currently working
    public boolean isWorking(){
        return isWorking;
    }
    
    //set method
    public void setIsWorking(boolean employed){
        this.isWorking = employed;
    }
    
    //abstract method to get pay for each employee
    public abstract double getPay();
    
    //method that returns String
    public String toString(){
        return this.getName() + " " + this.getEmployeeId() + " " + this.isWorking();
    }
}

