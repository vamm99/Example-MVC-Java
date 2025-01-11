/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class arrayPeople {

    private  ArrayList<people> listPeople;

    public arrayPeople() {
        listPeople = new ArrayList<>();
    }

    public void addPeople(people p) {
        listPeople.add(p);
    }

    public ArrayList<people> getListPeople() {
        return listPeople;
    }

}
