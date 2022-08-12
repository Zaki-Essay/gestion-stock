package ma.ensah.gestiondestock.dto;


import lombok.*;


import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CategoryDto extends AbstractEntity {



    private String code;



    private String designation;



    private List<ArticleDto> articles;





}
