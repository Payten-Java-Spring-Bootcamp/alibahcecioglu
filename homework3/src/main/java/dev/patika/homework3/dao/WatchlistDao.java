package dev.patika.homework3.dao;

import dev.patika.homework3.model.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistDao extends JpaRepository<Watchlist,Long> {
}
