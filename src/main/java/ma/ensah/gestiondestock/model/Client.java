package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "Client")
public class Client extends AbstractEntity {



    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "photo")
    private String photo;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "mail")
    private String mail;

    @Column(name = "address")
    @Embedded
    private Adresse adresse;





    @OneToMany(mappedBy = "client")
    private List<CommandClient> commandClients;



}
