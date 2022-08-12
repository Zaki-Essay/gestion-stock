package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Embeddable
public class Adresse {


    @Column(name = "adress1")
    private String adresse1;


    @Column(name = "adress2")
    private String adresse2;


    @Column(name="ville")
    private String ville;

    @Column(name="codepostal")
    private String codePostal;


    @Column(name="pays")
    private String pays;


}
