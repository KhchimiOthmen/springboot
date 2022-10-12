package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepart; // Clé primaire

    private String nomDepart;


    //////
@OneToMany(mappedBy = "dep")
    Set<Etudiant> etudiants;
}
