package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.Entity;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Vente extends AbstractEntity{

    private String code;

    private Instant dateVente;

    private String commentaire;

}
