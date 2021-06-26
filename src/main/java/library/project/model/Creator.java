package library.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Creator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String firstName;
    public String lastName;
    public String penName;
}
