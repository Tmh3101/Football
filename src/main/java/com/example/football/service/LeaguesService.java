package com.example.football.service;

import com.example.football.entity.Leagues;

import java.util.List;

public interface LeaguesService {

    public List<Leagues> getAllLeagues();

    public Leagues getLeaguesById(int id);

    public Leagues addLeagues(Leagues leagues);

    public Leagues updateLeagues(Leagues leagues);

    public void deleteLeagues(int id);


}
