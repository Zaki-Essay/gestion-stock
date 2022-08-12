package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.*;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Utilisateur extends AbstractEntity {

    private String nom;

    private String prenom;


    private Instant dateNaissance;

    private String password;

    @Embedded
    private Adresse adresse;

    private String photo;


    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private Enterprise enterprise;


    @OneToMany(mappedBy = "utilisateur")
    private List<Role> roles;

}
