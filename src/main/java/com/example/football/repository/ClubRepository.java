package com.example.football.repository;

import com.example.football.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubRepository extends JpaRepository<Club, Integer> {
}
