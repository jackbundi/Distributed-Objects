package com.ics.four.hotelserver.repository;

import com.ics.four.hotelserver.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel,Long> {
    List<Hotel> findByGroupId(Long id);
}
