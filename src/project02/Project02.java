package project02;

import java.io.*;
import java.util.*;

public class Project02 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students in the file: ");
        int numOfStudents = input.nextInt();
        
        System.out.print("Enter the number of staff in the file: ");
        int numOfStaff = input.nextInt();
        
        System.out.print("Enter the number of faculty in the file: ");
        int numOfFaculty = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter the name of the file: ");
        String inputFile = input.nextLine();
        
        File file = new File(inputFile);
        Scanner fileInput = new Scanner(file);
        
        Employee [] workers = new Employee[11];
        
        for(int i = 0; i < workers.length; i++){
            if (i < numOfStudents){
                String first = fileInput.next();
                String last = fileInput.next();
                String name = first + " " + last;
                int number = fileInput.nextInt();
                boolean working = fileInput.nextBoolean();
                int hours = fileInput.nextInt();
                boolean workStudy = fileInput.nextBoolean();
                double rate = fileInput.nextDouble();
                
                workers[i] = new StudentEmployee(name, number, working, hours, workStudy, rate);
            }
            else if(i < numOfStudents + numOfStaff){
                String first = fileInput.next();
                String last = fileInput.next();
                String name = first + " " + last;
                int number = fileInput.nextInt();
                boolean working = fileInput.nextBoolean();
                double salary = fileInput.nextDouble();
                String d1 = fileInput.next();
                String d2 = fileInput.next();
                String div = d1 + " " + d2;
               
                workers[i] = new ClassifiedStaff(name, number, working, salary, div);
            }
            else{
                String first = fileInput.next();
                String last = fileInput.next();
                String name = first + " " + last;
                int number = fileInput.nextInt();
                boolean working = fileInput.nextBoolean();
                double salary = fileInput.nextInt();
                int weeks = fileInput.nextInt();
                String dept = fileInput.nextLine();
               
                workers[i] = new Faculty(name, number, working, salary, weeks, dept);
            }
        }
        
        for (Employee worker : workers){
            System.out.println(worker);
        }
    }  
}
