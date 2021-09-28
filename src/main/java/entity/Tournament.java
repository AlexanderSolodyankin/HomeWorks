package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tourament")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "contry_id")
    private Country country;
    private String name;
    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;
}
