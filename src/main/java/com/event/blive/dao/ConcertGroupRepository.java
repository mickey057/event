package com.event.blive.dao;

import com.event.blive.model.ConcertGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertGroupRepository extends JpaRepository<ConcertGroup, Integer> {
}
