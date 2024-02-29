package com.example.football.service;

import com.example.football.entity.Player;

import java.util.List;

public interface PlayerService {
    public List<Player> getAllPlayers();

    public Player getPlayerById(int id);

    public Player addPlayer(Player player);

    public Player updatePlayer(Player player);

    public void deletePlayer(int id);

}
