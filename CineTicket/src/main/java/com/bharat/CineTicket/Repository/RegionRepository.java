package com.bharat.CineTicket.Repository;

import com.bharat.CineTicket.Model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region,Long> {
}
