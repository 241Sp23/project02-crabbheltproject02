package project02;

public abstract class Employee {
    private String employeeName;
    private int employeeId;
    private boolean isWorking;
    
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
        return String.format("%" + 10 + "s", this.getName() + " " + this.getEmployeeId() + " " + this.isWorking());
    }
}

