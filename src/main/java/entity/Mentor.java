package entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mentor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name="groups_id")
    private Group group;
}
