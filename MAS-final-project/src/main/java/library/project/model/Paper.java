package library.project.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("paper")
public class Paper extends Book{

    @ManyToOne()
    @JoinColumn(name = "place_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    public Place place;

}
