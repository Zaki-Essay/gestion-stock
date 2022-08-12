package ma.ensah.gestiondestock.dto;


import lombok.*;


import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class LigneCdeFournisseurDto extends AbstractEntity {


    private ArticleDto article;


    private CommandeFournisseurDto commandeFournisseurDto;


    private BigDecimal quantity;

    private BigDecimal prixUnitaire;

}
