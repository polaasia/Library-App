package library.project.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Paper extends Book{


    public Room room;

    @OneToOne
    public Place place;

}
