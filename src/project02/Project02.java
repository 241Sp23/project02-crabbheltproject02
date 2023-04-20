package project02;

import java.io.*;
import java.util.*;

public class Project02 {

    public static void main(String[] args) throws FileNotFoundException {
        String line = "";
        BufferedReader csvReader = null;
        Employee [] workers = new Employee[11];
        int i = 0;

        
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
        
        try{
            csvReader = new BufferedReader(new FileReader(inputFile));
            while((line = csvReader.readLine()) != null){
                String[] a = line.split(",");
                if (i < numOfStudents){
                    String name = a[0];
                    int number = Integer.parseInt(a[1]);
                    boolean working = Boolean.parseBoolean(a[2]);
                    int hours = Integer.parseInt(a[3]);
                    boolean workStudy = Boolean.parseBoolean(a[4]);
                    double rate = Double.parseDouble(a[5]);
                    workers[i] = new StudentEmployee(name, number, working, hours, workStudy, rate);
                    i++;
                    }
                else if(i < numOfStudents + numOfStaff){
                    String name = a[0];
                    int number = Integer.parseInt(a[1]);
                    boolean working = Boolean.parseBoolean(a[2]);
                    double salary = Double.parseDouble(a[3]);
                    String div = a[4];
               
                    workers[i] = new ClassifiedStaff(name, number, working, salary, div);
                    i++;
                    }
                else{
                    String name = a[0];
                    int number = Integer.parseInt(a[1]);
                    boolean working = Boolean.parseBoolean(a[2]);
                    double salary = Double.parseDouble(a[3]);
                    int weeks = Integer.parseInt(a[4]);
                    String dept = a[5];
               
                    workers[i] = new Faculty(name, number, working, salary, weeks, dept);
                    i++;
                    }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try {
                csvReader.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }

        System.out.println();
        for (Employee worker : workers){
            System.out.println(worker);
        }
        
        System.out.println();
        System.out.println("Pay for two-week pay period");
        System.out.println("===========================");
        for(Employee worker : workers){
            if(worker.isWorking() == true){
                System.out.print(worker.getName() + " ");
                System.out.printf("$%.2f", worker.getPay());
                System.out.println();
            }
        }
     
}
}
