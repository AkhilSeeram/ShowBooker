package com.scaler.showbooker.repositories;

import com.scaler.showbooker.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

    List<Seat> findAllByIdIn(List<Long> seatIds);
    // select *
    // from seats
    // where id = {}
    // and col = {}
}
