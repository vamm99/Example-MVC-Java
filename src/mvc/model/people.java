/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

/**
 *
 * @author ASUS
 */
public class people {
    private int id;
    private int age;
    private String names;
    private String lastName;
    
    public people(int id, int age, String names, String lastName){
        this.id = id;
        this.age = age;
        this.names = names;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return names;
    }

    public String getLastName() {
        return lastName;
    }
    
    @Override
    public String toString(){
        return 
                "id: " + this.getId() + " " +
                "Age: " + this.getAge() + " " +
                "Name: " + this.getName() + " " +
                "Last Name: " + this.getLastName();
    }
}
