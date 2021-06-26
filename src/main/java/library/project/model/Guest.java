package library.project.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Guest extends User{

    @NotNull
    public Long phoneNumber;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<BorrowedBook> borrowedBooks;

}
