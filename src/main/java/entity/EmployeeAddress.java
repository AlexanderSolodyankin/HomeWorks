package entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employee_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
/** Осоторожно с аннотацией @ToString от lombok заходит в рекурсию и получаем StackOverflow! Лучше самому прописать toString**/
public class EmployeeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String district;
    @Column(nullable = false)
    private Integer houseNumber;
    private Integer flatNumber;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @Override
    public String toString() {
        return "Район: " + district + ", Дом: " + houseNumber + ", Квартира: " + flatNumber;
    }
}



















