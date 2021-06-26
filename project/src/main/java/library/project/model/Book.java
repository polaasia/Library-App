package library.project.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "series")})
public abstract class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String title;
    private String language;

//    @Qualifier
//    private int inSeriesId;
//
//    @ManyToOne
//    @JoinColumn(name = "series_id")
//    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
//    private Series series;

    @ElementCollection
    @CollectionTable(name = "book_genres", joinColumns = @JoinColumn(name = "book_id"))
    public List<String> genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Author writtenBy;

    @ManyToOne
    @JoinColumn(name = "illustrator_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Illustrator illustratedBy;

    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<ReadBook> readBooks;

    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<BorrowedBook> borrowedBooks;
}

