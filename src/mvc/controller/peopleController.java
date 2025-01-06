/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.util.ArrayList;
import mvc.model.arrayPeople;
import mvc.model.people;
import mvc.view.viewPeople;

/**
 *
 * @author ASUS
 */
public class peopleController {

    private people p;
    private final arrayPeople a;
    private final viewPeople v;

    public peopleController() {
        a = new arrayPeople();
        v = new viewPeople();
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

        p = new people(id, age, names, lastname);

        this.a.addPeople(p);
        System.out.println("Persona agregada con éxito.");
        this.showPeople();
    }

    public void showPeople() {
        ArrayList<people> lp = this.a.getListPeople();

        lp.forEach((pe) -> {
            System.out.println(pe);
        });
    }

    public void showView() {
        this.v.setVisible(true);
        this.v.setLocationRelativeTo(null);
    }

}
