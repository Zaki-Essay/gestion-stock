package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "Article")
public class Article extends AbstractEntity {
    

    @Column(name = "codearticle")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;


    @Column(name = "prixunitaireHt")
    private BigDecimal prixUnitaireHt;


    @Column(name = "tauxtva")
    private BigDecimal tauxTva;


    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;


    @Column(name = "photo")
    private String photo;


    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;



}
