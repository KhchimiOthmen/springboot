package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailEquipe; // Clé primaire
    private  Integer salle;
    private  String thematique;



    //////
    @OneToOne
    Equipe equipes;
}
