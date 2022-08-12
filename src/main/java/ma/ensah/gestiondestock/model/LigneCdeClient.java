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
public class LigneCdeClient extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "id_article")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "id_commandclient")
    private CommandClient commandClient;

    private BigDecimal quantity;

    private BigDecimal prixUnitaire;


}
