/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.dailychallenge.cls;

/**
 *
 * @author ezekielkouassi
 */
public class Person {
    
    private String name;
    private int age;
    private double salary;
    
    public Person() {
        this.name = "ezekiel kouassi";
        this.age = 19;
        this.salary = 2000000000.0;
    }
    
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = -1;
    }
    
    public void displayInfo() {
        if(this.salary != -1) {
            System.out.println("information : name : " + 
                this.name + "age : " + 
                this.age + "salary : "+ 
                this.salary);
        } else {
            System.out.println("information : name : " + 
                this.name + "age : " + 
                this.age + "salary : salary not provided");
        }
        
  
        
    }
}
