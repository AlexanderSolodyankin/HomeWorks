package org.example.taskA;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Car {
    private int manufactureYear;
    private  String model;
    private Integer price;
    private String color;
}
