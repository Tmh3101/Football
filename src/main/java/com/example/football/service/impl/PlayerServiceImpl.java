package com.example.football.service.impl;

import com.example.football.entity.Player;
import com.example.football.repository.PlayerRepository;
import com.example.football.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(@Autowired PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Player getPlayerById(int id) {
        Optional<Player> res = playerRepository.findById(id);
        return res.orElse(null);
    }

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(int id) {
        playerRepository.deleteById(id);
    }
}
