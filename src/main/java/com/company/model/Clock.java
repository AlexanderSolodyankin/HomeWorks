package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


@Data
@Builder
@AllArgsConstructor
public class Clock {
    private String currentTime;

    public Clock() {
        this.currentTime = " " + new GregorianCalendar().get(Calendar.HOUR) + " : " +
                new GregorianCalendar().get(Calendar.MINUTE);
    }
}
