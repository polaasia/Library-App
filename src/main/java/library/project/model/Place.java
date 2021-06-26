package library.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @Enumerated(EnumType.STRING)
    public Room room;

    public String bookcase;

    @Min(0)
    public int shelfNumber;

    @OneToOne(mappedBy = "place", fetch = FetchType.LAZY)
    private Paper paper;




}
