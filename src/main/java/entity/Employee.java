package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
/** Осоторожно с аннотацией @ToString от lombok заходит в рекурсию и получаем StackOverflow! Лучше самому прописать toString**/
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(nullable = false)
    private Integer age;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_address_id", nullable = false, unique = true)
    private EmployeeAddress employeeAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private Integer salary;

    @Override
    public String toString() {
        return "Имя: " + fullName + ", Возраст: " + age + ", Зарплата: " + salary;
    }
}
