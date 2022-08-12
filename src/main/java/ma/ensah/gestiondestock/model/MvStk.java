package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class MvStk extends AbstractEntity{

    private Instant dataMvt;

    private BigDecimal quantity;

    private TypeMvt typeMvt;


    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;


}
