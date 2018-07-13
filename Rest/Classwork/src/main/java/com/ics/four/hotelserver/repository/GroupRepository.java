package com.ics.four.hotelserver.repository;

import com.ics.four.hotelserver.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group,Long> {
}
