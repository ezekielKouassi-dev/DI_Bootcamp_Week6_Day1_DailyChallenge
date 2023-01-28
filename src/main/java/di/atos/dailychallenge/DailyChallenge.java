/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.dailychallenge;

import di.atos.dailychallenge.cls.Person;

/**
 *
 * @author ezekielkouassi
 */
public class DailyChallenge {

    public static void main(String[] args) {
        Person OPerson = new Person();
        Person OPerson2 = new Person("Dago Corine", 26, 400000000);
        OPerson.displayInfo();
        OPerson.displayInfo();
        Person OPerson3 = new Person("cisse charlène", 21);
        OPerson3.displayInfo();
    }
}
