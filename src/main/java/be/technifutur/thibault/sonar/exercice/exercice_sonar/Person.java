package be.technifutur.thibault.sonar.exercice.exercice_sonar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer id;

    String name;
    String firstname;

}
