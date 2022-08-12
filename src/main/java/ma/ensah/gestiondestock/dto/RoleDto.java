package ma.ensah.gestiondestock.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class RoleDto extends AbstractEntity {

    private String roleName;


    private UtilisateurDto utilisateur;
}
