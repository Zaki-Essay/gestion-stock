package ma.ensah.gestiondestock.dto;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ClientDto extends AbstractEntity {




    private String nom;


    private String prenom;


    private String photo;

    private String telephone;


    private String mail;

    private AdresseDto adresseDto;






    private List<CommandClientDto> commandClientsDto;



}
