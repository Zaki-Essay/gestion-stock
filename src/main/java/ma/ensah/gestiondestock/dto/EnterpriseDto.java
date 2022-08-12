package ma.ensah.gestiondestock.dto;


import lombok.*;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Builder
public class EnterpriseDto extends AbstractEntity {


    private String nom;

    private String description;

    private String codeFiscal;

    private String photo;

    private String mail;

    private String telephone;

    private String siteWeb;

    private List<UtilisateurDto> utilisateursDto;

}
