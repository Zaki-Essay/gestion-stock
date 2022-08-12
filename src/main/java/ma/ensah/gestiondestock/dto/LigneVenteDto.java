package ma.ensah.gestiondestock.dto;


import lombok.*;
import ma.ensah.gestiondestock.model.Vente;


import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class LigneVenteDto extends AbstractEntity {


    private Vente vente;

    private BigDecimal quantity;

    private BigDecimal prixUnitaire;
}
