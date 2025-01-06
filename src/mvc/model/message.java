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
public class message {
    private String message;
    
    public message(){
        this.message = "Hola mundo";
    }
    
    public String getMessage(){
        return this.message;
    }
}
