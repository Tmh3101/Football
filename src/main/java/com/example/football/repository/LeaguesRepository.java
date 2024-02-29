package com.example.football.repository;

import com.example.football.entity.Leagues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaguesRepository extends JpaRepository<Leagues, Integer> {

}
