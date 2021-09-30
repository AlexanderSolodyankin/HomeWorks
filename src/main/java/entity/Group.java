package entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "group")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "mentor_id")
    private Mentor mentor;

    @ManyToMany
    @JoinColumn(name="student_id")
    private List<Student> studentList;

    @ManyToOne
    @JoinColumn(name="courses_id")
    private Courses courses;
}
