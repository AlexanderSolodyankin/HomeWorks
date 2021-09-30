package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
/** Осоторожно с аннотацией @ToString от lombok заходит в рекурсию и получаем StackOverflow! Лучше самому прописать toString**/
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "department_id") //нужно указать name такой как в Employee - Department
    private Set<Employee> employees;

    @Override
    public String toString() {
        return "Название: " + name;
    }
}
