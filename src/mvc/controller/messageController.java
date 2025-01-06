/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import javax.swing.JOptionPane;
import mvc.model.message;
import mvc.view.view1;

/**
 *
 * @author ASUS
 */
public final class messageController {
    private final message m;
    private final view1 v;
    
    public messageController(){
        this.m = new message();
        this.v = new view1();
        eventMenssage();
    }
    
    public void eventMenssage(){
        this.v.action().addActionListener(e->this.outMessage());
    }
    
    public void outMessage(){
        JOptionPane.showMessageDialog(null, "Message from model: " + m.getMessage());
    }
    
    public void showView(){
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
    }
    
    
    
    
}
