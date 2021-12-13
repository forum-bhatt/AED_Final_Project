/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;

/**
 *
 * @author raunak
 */
public class Employee extends Person {
    
    private String name;
    private int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
