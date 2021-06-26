package library.project.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Illustrator extends Creator {

    @OneToMany(mappedBy = "illustratedBy", fetch = FetchType.LAZY)
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    public List<Book> illustratedBooks = new ArrayList<>();
}


