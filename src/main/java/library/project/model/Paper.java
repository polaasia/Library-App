package library.project.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Paper extends Book{

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "place_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    public Place place;

}
