package com.example.football.service.impl;

import com.example.football.entity.Club;
import com.example.football.repository.ClubRepository;
import com.example.football.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    public ClubServiceImpl(@Autowired ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }

    @Override
    public List<Club> getAllClub() {
        return clubRepository.findAll();
    }

    @Override
    public Club getClubById(int id) {
        Optional<Club> res = clubRepository.findById(id);
        return res.orElse(null);
    }

    @Override
    public Club addClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public Club updateClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public void deleteClub(int id) {
        clubRepository.deleteById(id);
    }
}
