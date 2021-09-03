package com.smartech.i2019.adaptiveinterviews.specification;

import com.smartech.i2019.adaptiveinterviews.model.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class UserSpecification {
    public Specification<User> hasName(String name) {
        return (user, cq, cb) -> cb.equal(user.get("name"), name);
    }
}
