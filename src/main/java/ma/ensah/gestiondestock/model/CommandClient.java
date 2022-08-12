package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Builder
@Getter
@Entity
public class CommandClient extends AbstractEntity {


    @Column(name = "code")
    private String code;


    @Column(name = "dateCommande")
    private Instant dateCommande;


    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;


    @OneToMany(mappedBy = "commandClient")
    private List<LigneCdeClient> ligneCdeClientList;



}

