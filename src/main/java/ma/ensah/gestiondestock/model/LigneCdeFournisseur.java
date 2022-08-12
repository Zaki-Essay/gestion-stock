package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class LigneCdeFournisseur extends AbstractEntity {


    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;


    @ManyToOne
    @JoinColumn(name = "id_commandfournisseur")
    private CommandeFournisseur commandeFournisseur;


    private BigDecimal quantity;

    private BigDecimal prixUnitaire;

}
