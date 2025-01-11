/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import mvc.model.arrayPeople;
import mvc.model.people;
import mvc.view.viewPeople;

/**
 *
 * @author ASUS
 */
public final class peopleController {

    private final arrayPeople a;
    private final viewPeople v;
    private final DefaultTableModel model;

    public peopleController() {
        a = new arrayPeople();
        v = new viewPeople();
        String[] column = {"Id", "Age", "Name", "Last Name"};
        model = new DefaultTableModel(null, column);
        v.setTableModel(model);
        eventAddPeople();
    }

    public void eventAddPeople() {
        this.v.getAction().addActionListener(e -> this.addPeopleController());
    }

    public void addPeopleController() {
        int id = this.v.getId();
        int age = this.v.getAge();
        String names = this.v.getNam();
        String lastname = this.v.getLastName();

        if (id < 0) {
            System.out.println("El ID debe ser mayor a 0.");
            return;
        }
        if (age <= 0) {
            System.out.println("La edad debe ser mayor a 0.");
            return;
        }
        if (names == null || names.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }
        if (lastname == null || lastname.trim().isEmpty()) {
            System.out.println("El apellido no puede estar vacío.");
            return;
        }

        people p = new people(id, age, names, lastname);

        a.addPeople(p);
        System.out.println("Persona agregada con éxito.");
        this.showPeople();
        this.addPeopleTableController(id, age, names, lastname);
    }
    
    public void addPeopleTableController(int id, int age, String name, String lastName){
        this.model.addRow(new Object[]{id, age, name, lastName});
        this.v.setTableModel(model);
    }

    public void showPeople() {
        ArrayList<people> lp = this.a.getListPeople();

        for (people pe : lp) {
            System.out.println(pe);
        }
    }

    public void showView() {
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
    }

}
