package dev.patika.homework3.service;

import dev.patika.homework3.dao.MemberDao;
import dev.patika.homework3.dao.MovieDao;
import dev.patika.homework3.dao.PuanDao;
import dev.patika.homework3.model.Member;
import dev.patika.homework3.model.Movie;
import dev.patika.homework3.model.Puan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PuanService {
    private final PuanDao puanDao;
    private final MemberDao memberDao;
    private final MovieDao movieDao;

    public Optional<Puan> createPuan(Long movieId,Long memberId,Long puan){
        Member member=memberDao.getById(memberId);
        Movie movie=movieDao.getById(movieId);
        Puan puanN= Puan.builder().point(puan).member(member).movie(movie).build();

        return Optional.of(puanDao.save(puanN));

    }
}
