package com.smartech.i2019.adaptiveinterviews.specification;

import com.smartech.i2019.adaptiveinterviews.model.Interview;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class InterviewSpecification {
    public Specification<Interview> hasDate(Date date) {
        return (interview, cq, cb) -> cb.equal(interview.get("date"), date);
    }

    public Specification<Interview> hasDescription(String description) {
        return (interview, cq, cb) -> cb.equal(interview.get("description"), description);
    }
}
