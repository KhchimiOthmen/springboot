package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContrat;
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;
    /////
    @ManyToOne
    private Etudiant etudiants;


}
