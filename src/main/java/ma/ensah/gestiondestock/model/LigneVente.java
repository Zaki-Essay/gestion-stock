package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class LigneVente extends AbstractEntity{



    @ManyToOne
    @JoinColumn(name = "id_vente")
    private Vente vente;

    private BigDecimal quantity;

    private BigDecimal prixUnitaire;
}
