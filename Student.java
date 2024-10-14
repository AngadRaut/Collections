package javaBasics;

public class Student {
    int age;
    String name;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+":"+age;
    }
    public static void main(String[] args) {
    }
}
