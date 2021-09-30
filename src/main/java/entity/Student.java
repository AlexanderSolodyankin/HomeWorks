package entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "groups_study_id")
    private Group stadyGroup;

    @OneToMany
    @JoinColumn(name = "groups_attends_id", unique = true, insertable = false)
    private List<Group> groupsAttends;

}
