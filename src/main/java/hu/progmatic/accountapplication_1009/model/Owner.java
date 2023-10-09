package hu.progmatic.accountapplication_1009.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "place_of_birth")
    private String placeOfBirth;
    @Column(name = "time_of_birth")
    private Date timeOfBirth;
    private String email;

    @OneToMany(mappedBy = "owner")
    @JsonBackReference
    private List<Expense> expenses = new ArrayList<>();
}
