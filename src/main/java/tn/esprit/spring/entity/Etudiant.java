package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant; // Clé primaire
    private  String prenomE;
    private  String nomE;
    private Option option;

    //////

    @ManyToOne
    private Departement dep;
    @OneToMany(mappedBy = "etudiants")
    Set<Contrat> contrats;
    @ManyToMany
    Set<Equipe> equipes;
}
