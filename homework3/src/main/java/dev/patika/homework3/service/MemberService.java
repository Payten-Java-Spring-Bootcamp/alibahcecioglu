package dev.patika.homework3.service;

import dev.patika.homework3.dao.MemberDao;
import dev.patika.homework3.model.Member;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberDao memberDao;

    public Optional<List<Member>> getAllMembers(){
        return Optional.of(memberDao.findAll());
    }

    public Optional<Member> getMemberById(Long id){
        return Optional.of(memberDao.getById(id));
    }

    public Optional<Member> saveMember(Member member){
        return Optional.of(memberDao.save(member));
    }
    public Optional<String > deleteMemberById(Long id){
        memberDao.deleteById(id);
        return Optional.of("Silindi");
    }
}
