package com.example.football.rest;

import com.example.football.entity.Club;
import com.example.football.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/club")
public class ClubController {

    private final ClubService clubService;

    public ClubController(@Autowired ClubService clubService){
        this.clubService = clubService;
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
        return ResponseEntity.ok(clubService.addClub(club));
    }

    @PostMapping("/updateClub")
    public ResponseEntity<?> updateClub(@RequestBody Club club) {
        return ResponseEntity.ok(clubService.updateClub(club));
    }

    @PostMapping("/deleteClub")
    public ResponseEntity<?> deleteClub(@RequestBody int id){
        clubService.deleteClub(id);
        return ResponseEntity.ok("Done!");
    }




}
