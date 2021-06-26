package library.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BorrowedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private LocalDate dateBorrowed;
    private LocalDate dateReturned;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    @NotNull
    private Book book;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    @NotNull
    private Guest guest;

}


