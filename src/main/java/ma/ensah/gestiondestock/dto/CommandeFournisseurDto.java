package ma.ensah.gestiondestock.dto;


import lombok.*;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CommandeFournisseurDto  extends AbstractEntity {



    private String code;



    private Instant dateCommande;



    private FournisseurDto fournisseurDto;



    private List<LigneCdeFournisseurDto> ligneCdeFournisseursDto ;
}
