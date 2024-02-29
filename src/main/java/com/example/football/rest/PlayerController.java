package com.example.football.rest;

import com.example.football.entity.Player;
import com.example.football.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(@Autowired PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("")
    public ResponseEntity<?> getAllPlayers(){
        return ResponseEntity.ok(playerService.getAllPlayers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getPlayerById(@PathVariable int id){
        return ResponseEntity.ok(playerService.getPlayerById(id));
    }

    @PostMapping("/addPlayer")
    public ResponseEntity<?> addPlayer(@RequestBody Player player){
        return ResponseEntity.ok(playerService.addPlayer(player));
    }

    @PostMapping("/updatePlayer")
    public ResponseEntity<?> updatePlayer(@RequestBody Player player){
        return ResponseEntity.ok(playerService.updatePlayer(player));
    }

    @PostMapping("/deletePlayer")
    public ResponseEntity<?> deletePlayer(@RequestBody Player player){
        playerService.addPlayer(player);
        return ResponseEntity.ok("Done!");
    }

}
