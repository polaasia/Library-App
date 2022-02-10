package library.project.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@Entity
@Table(name = "creator")
@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
public class Creator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "firstName")
    public String firstName;
    @Column(name = "lastName")
    public String lastName;
    @Column(name = "penName")
    public String penName;

    @Column(name = "creatorType")
   public CreatorType creatorType;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "writtenBy", cascade = CascadeType.REMOVE)
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Book> writtenBooks = new ArrayList<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "illustratedBy", cascade = CascadeType.REMOVE)
    @Builder.Default
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    public List<Book> illustratedBooks = new ArrayList<>();
}
