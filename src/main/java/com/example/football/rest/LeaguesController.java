package com.example.football.rest;

import com.example.football.entity.Leagues;
import com.example.football.service.LeaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leagues")
public class LeaguesController {

    private final LeaguesService leaguesService;

    public LeaguesController(@Autowired LeaguesService leaguesService){
        this.leaguesService = leaguesService;
    }

    @GetMapping("")
    public ResponseEntity<?> getListLeagues(){
        return ResponseEntity.ok(leaguesService.getAllLeagues());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getLeaguesById(@PathVariable int id){
        return ResponseEntity.ok(leaguesService.getLeaguesById(id));
    }

    @PostMapping("/addLeagues")
    public ResponseEntity<?> addLeagues(@RequestBody Leagues leagues){
        return ResponseEntity.ok(leaguesService.addLeagues(leagues));
    }

    @PostMapping("/updateLeagues")
    public ResponseEntity<?> updateLeagues(@RequestBody Leagues leagues){
        return ResponseEntity.ok(leaguesService.updateLeagues(leagues));
    }

    @PostMapping("/deleteLeagues")
    public ResponseEntity<?> deleteLeagues(@RequestBody Leagues leagues){
        leaguesService.deleteLeagues(leagues.getLeaguesId());
        return ResponseEntity.ok("Done!");
    }

}
