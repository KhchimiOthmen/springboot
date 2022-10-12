package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniv; // Clé primaire
    private  String nomUniv;



    ///


    @OneToMany
    Set<Departement> dep;


}
