package ma.ensah.gestiondestock.dto;


import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ArticleDto {
    


    private String codeArticle;


    private String designation;



    private BigDecimal prixUnitaireHt;



    private BigDecimal tauxTva;



    private BigDecimal prixUnitaireTtc;


    private String photo;


    private CategoryDto categoryDto;



}
