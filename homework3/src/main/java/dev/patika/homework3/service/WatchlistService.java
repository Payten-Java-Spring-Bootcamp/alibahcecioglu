package dev.patika.homework3.service;

import dev.patika.homework3.dao.MemberDao;
import dev.patika.homework3.dao.MovieDao;
import dev.patika.homework3.dao.WatchlistDao;
import dev.patika.homework3.model.Member;
import dev.patika.homework3.model.Movie;
import dev.patika.homework3.model.Puan;
import dev.patika.homework3.model.Watchlist;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WatchlistService {
    private final MemberDao memberDao;
    private final MovieDao movieDao;
    private final WatchlistDao watchlistDao;

    public Optional<Watchlist> createWatchlist( Long memberId,String name){
        Member member=memberDao.getById(memberId);
        Watchlist watchlist1= Watchlist.builder().member(member).name(name).build();
        return Optional.of(watchlistDao.save(watchlist1));

    }
    public Optional<Watchlist> addMovieToWatchlist( Long movieId,Long watchlistId){
        Movie movie=movieDao.getById(movieId);
        Watchlist watchlist=watchlistDao.getById(watchlistId);
        watchlist.getMovielist().add(movie);
        return Optional.of(watchlistDao.save(watchlist));

    }




}
