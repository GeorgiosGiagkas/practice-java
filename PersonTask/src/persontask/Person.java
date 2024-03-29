/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persontask;

/**
 *
 * @author giagkas
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    //public access modifier. Getters - accessor methods
    public String getFirstName(){
        return this.firstName;//this pointer to instance of class Person
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    
    //setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setAge(int age){
        if(age<0 || age>100){
            this.age=0;
        }else{
            this.age= age;
        }
    }
    
    public boolean isTeen(){
        return (this.age>12 && this.age<20);
    }
    
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
           return "";//empty String
        }
        else if(this.firstName.isEmpty()){
            return this.lastName;
        }
        else if(this.lastName.isEmpty()){
            return this.firstName;
        }
        else{
            return this.firstName+" "+this.lastName;
        }
           
    }
}
