package collection.comparablecomparator;

import java.util.Arrays;
import java.util.Collections;

public class Employee {
    int id;
    String name ;
    double salary;

    Employee(int id,String name,double salary){
        this.id = id ;
        this.name = name ;
        this.salary = salary ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee[] empArr = new Employee[8];
        empArr[0] = new Employee(10, "Mikey", 10000);
        empArr[1] = new Employee(20, "Arun", 20000);
        empArr[2] = new Employee(5, "Lisa",  5000);
        empArr[3] = new Employee(1, "Pankaj", 50000);
        empArr[5] = new Employee(11, "Jyoti", 55000);
        empArr[6] = new Employee(2, "Hrutvik", 90000);
        empArr[7] = new Employee(55, "Manoj",  8000);
        empArr[4] = new Employee(70, "Zoya", 20000);

        System.out.println(Arrays.toString(empArr));



        EmployeeSortByComparator obj = new EmployeeSortByComparator();
        Arrays.sort(empArr,obj);

        System.out.println(Arrays.toString(empArr));

    }
    public String toString(){
        return "{ name : "+name+",id : "+id+" ,salary : "+salary+" }\n";
    }
}
