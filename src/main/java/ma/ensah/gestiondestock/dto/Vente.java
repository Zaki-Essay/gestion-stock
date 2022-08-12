package ma.ensah.gestiondestock.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Vente extends AbstractEntity {

    private String code;

    private Instant dateVente;

    private String commentaire;


}
