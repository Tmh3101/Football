package com.example.football.service;

import com.example.football.entity.Club;
import com.example.football.entity.Leagues;

import java.util.List;

public interface ClubService {

    public List<Club> getAllClub();

    public Club getClubById(int id);

    public Club addClub(Club club);

    public Club updateClub(Club club);

    public void deleteClub(int id);

}
