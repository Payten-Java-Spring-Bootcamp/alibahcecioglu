package dev.patika.homework3.dao;

import dev.patika.homework3.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface MemberDao extends JpaRepository<Member,Long> {

}
