package library.project.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Series {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;


    private int inSeriesId;

    @OneToMany(mappedBy = "series")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Book> booksInSeries;
}
