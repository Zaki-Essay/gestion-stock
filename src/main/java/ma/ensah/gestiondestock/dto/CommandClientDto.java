package ma.ensah.gestiondestock.dto;


import lombok.*;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CommandClientDto extends AbstractEntity {



    private String code;



    private Instant dateCommande;



    private ClientDto clientDto;



    private List<LigneCdeClientDto> ligneCdeClientListDto;



}

