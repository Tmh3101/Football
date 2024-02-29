package com.example.football.service.impl;

import com.example.football.entity.Leagues;
import com.example.football.repository.LeaguesRepository;
import com.example.football.service.LeaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaguesServiceImpl implements LeaguesService {

    private final LeaguesRepository leaguesRepository;

    public LeaguesServiceImpl(@Autowired LeaguesRepository leaguesRepository){
        this.leaguesRepository = leaguesRepository;
    }

    @Override
    public List<Leagues> getAllLeagues() {
        return leaguesRepository.findAll();
    }

    @Override
    public Leagues getLeaguesById(int id) {
        Optional<Leagues> res = leaguesRepository.findById(id);
        return res.orElse(null);
    }

    @Override
    public Leagues addLeagues(Leagues leagues) {
        return leaguesRepository.save(leagues);
    }

    @Override
    public Leagues updateLeagues(Leagues leagues) {
        return leaguesRepository.save(leagues);
    }

    @Override
    public void deleteLeagues(int id) {
        leaguesRepository.deleteById(id);
    }
}
