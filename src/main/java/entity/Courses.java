package entity;


import jdk.dynalink.linker.LinkerServices;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name="group_id")
    private List<Group> groupList;
}
