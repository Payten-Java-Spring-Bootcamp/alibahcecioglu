package dev.patika.homework3.dao;

import dev.patika.homework3.model.Puan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuanDao extends JpaRepository<Puan,Long> {
}
