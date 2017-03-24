/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glbank;

/**
 *
 * @author Adrián Matta
 */
public class Employee {
        private final int idemp;
        private final String firstname;
        private final String lastname;
        private final String email;
        private final char position;

public Employee(int idemp, String firstname, String lastname, String email, char position) {
        this.idemp = idemp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.position = position;
    }

public int getIdemp() {
        return idemp;
    }

public String getFirstname() {
        return firstname;
    }

public String getLastname() {
        return lastname;
    }

public String getEmail() {
        return email;
    }

public char getPosition() {
        return position;
    }
    
    
    
    
}
