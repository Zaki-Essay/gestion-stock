package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Enterprise extends AbstractEntity{

    private String nom;

    private String description;

    private String codeFiscal;

    private String photo;

    private String mail;

    private String telephone;

    private String siteWeb;


    @OneToMany(mappedBy = "enterprise")
    private List<Utilisateur> utilisateurs;

}
