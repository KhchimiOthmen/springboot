package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe; // Clé primaire
    private  String nomEquipe;
    private Niveau niveau;

    //////

    @ManyToMany(mappedBy = "equipes")
    Set<Etudiant> etudiants;
    @OneToOne
    DetailEquipe detailequipes;



}