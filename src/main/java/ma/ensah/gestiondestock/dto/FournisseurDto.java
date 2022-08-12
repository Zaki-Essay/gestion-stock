package ma.ensah.gestiondestock.dto;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class FournisseurDto extends AbstractEntity {


    private String nom;

    private String prenom;

    private String photo;

    private String telephone;

    private String mail;

    private AdresseDto adresse;

    private List<CommandeFournisseurDto> commandeFournisseursDto;

}
