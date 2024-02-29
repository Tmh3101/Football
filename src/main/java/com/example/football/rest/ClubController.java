package com.example.football.rest;

import com.example.football.entity.Club;
import com.example.football.entity.Leagues;
import com.example.football.service.ClubService;
import com.example.football.service.LeaguesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/club")
public class ClubController {

    private final ClubService clubService;
    private final LeaguesService leaguesService;

    public ClubController(@Autowired ClubService clubService, @Autowired LeaguesService leaguesService){
        this.clubService = clubService;
        this.leaguesService = leaguesService;
    }

    @GetMapping("")
    public ResponseEntity<?> getListClub(){
        return ResponseEntity.ok(clubService.getAllClub());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClubById(@PathVariable int id){
        return ResponseEntity.ok(clubService.getClubById(id));
    }

    @PostMapping("/addClub")
    public ResponseEntity<?> addClub(@RequestBody Club club){
        club.setLeagues(leaguesService.getLeaguesById(club.getLeagues().getLeaguesId()));
        return ResponseEntity.ok(clubService.addClub(club));
    }

}
