/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.controller.messageController;
import mvc.view.view1;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        view1 v1 = new view1();
        messageController controller;
        
        controller = new messageController();
        controller.showView();
       
        
    }
    
}
