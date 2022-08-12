package ma.ensah.gestiondestock.dto;


import lombok.*;
import ma.ensah.gestiondestock.model.TypeMvt;


import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class MvStkDto extends AbstractEntity {
    private Instant dataMvt;

    private BigDecimal quantity;

    private TypeMvt typeMvt;


    private ArticleDto articleDto;
}
