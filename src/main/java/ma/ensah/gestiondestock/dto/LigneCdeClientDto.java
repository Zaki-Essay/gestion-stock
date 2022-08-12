package ma.ensah.gestiondestock.dto;


import lombok.*;



import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class LigneCdeClientDto extends AbstractEntity {


    private ArticleDto articleDto;

    private CommandClientDto commandClientDto;

    private BigDecimal quantity;

    private BigDecimal prixUnitaire;


}
