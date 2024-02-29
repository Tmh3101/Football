package com.example.football.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class Player {

    @Id
    private int playerId;

    private String playerName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "club_id")
    private Club club;

    private String position;

    private int goal;

    private int trophy;

    private long salary;

    private String avatarUrl;

}
