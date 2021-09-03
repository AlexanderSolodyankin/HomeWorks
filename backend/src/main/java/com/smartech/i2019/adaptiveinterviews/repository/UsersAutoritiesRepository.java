package com.smartech.i2019.adaptiveinterviews.repository;

import com.smartech.i2019.adaptiveinterviews.model.UserAutorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersAutoritiesRepository extends JpaRepository<UserAutorities, Long>,
        JpaSpecificationExecutor<UserAutorities> {
}
