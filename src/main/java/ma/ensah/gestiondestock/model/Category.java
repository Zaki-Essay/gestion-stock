package ma.ensah.gestiondestock.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
@Table(name = "Category")
public class Category extends AbstractEntity  {


    @Column(name = "code")
    private String code;


    @Column(name = "designation")
    private String designation;


    @OneToMany(mappedBy = "category")
    private List<Article> articles;





}
