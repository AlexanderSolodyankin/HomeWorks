package com.smartech.i2019.adaptiveinterviews.specification;

import com.smartech.i2019.adaptiveinterviews.model.UserAutorities;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class UserAutoritiesSpecification {
    public Specification<UserAutorities> hasUsername(String username) {
        return (userAutorities, cq, cb) -> cb.equal(userAutorities.get("username"), username);
    }
}
