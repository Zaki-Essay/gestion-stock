package ma.ensah.gestiondestock.dto;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AdresseDto {



    private String adresse1;


    private String adresse2;


    private String ville;


    private String codePostal;



    private String pays;


}
