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

    @ManyToMany
    @JoinColumn(name = "group_id", unique = true, insertable = false)
    private List<Group> groups;

}
