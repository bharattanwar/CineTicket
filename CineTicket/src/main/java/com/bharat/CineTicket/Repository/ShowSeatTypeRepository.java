package com.bharat.CineTicket.Repository;

import com.bharat.CineTicket.Model.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType,Long> {
}
