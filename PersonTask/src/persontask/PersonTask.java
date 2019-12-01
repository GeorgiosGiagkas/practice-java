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
public class PersonTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person = new Person();
        person.setFirstName("Death");
        person.setLastName("Zero");
        person.setAge(18);
        
        System.out.println(person.getFullName()+" is teen: "+person.isTeen());
    }
    
}
