package ma.ensah.gestiondestock.dto;


import lombok.*;
import ma.ensah.gestiondestock.model.Adresse;
import ma.ensah.gestiondestock.model.Enterprise;
import ma.ensah.gestiondestock.model.Role;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UtilisateurDto extends AbstractEntity {

    private String nom;

    private String prenom;


    private Instant dateNaissance;

    private String password;

    private Adresse adresse;

    private String photo;



    private Enterprise enterprise;



    private List<Role> roles;
}
